package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.order.dto.OwnTea;
import com.example.jwt.domain.order_position.OrderPosition;

import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.rank.RankService;
import com.example.jwt.domain.tea.TeaService;

import com.example.jwt.domain.teatype.TeaTypeService;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl extends ExtendedServiceImpl<Order> implements OrderService {

    TeaService teaService;
    UserService userService;
    RankService rankService;
    TeaTypeService teaTypeService;


    @Autowired
    public OrderServiceImpl(ExtendedRepository<Order> repository, Logger logger, TeaService teaService, UserService userService, RankService rankService, TeaTypeService teaTypeService) {
        super(repository, logger);
        this.teaService = teaService;
        this.userService = userService;
        this.rankService = rankService;
        this.teaTypeService = teaTypeService;
    }

    @Override
    @Transactional
    public Order createOrder(Order order) throws Exception {
        Set<OrderPosition> detachedPositions = order.getOrderPositions();
        Order cachedOrder = save(order.setOrderPositions(new HashSet<>()).setUser(userService.findPrincipal().user()));
        cachedOrder.setOrderPositions(detachedPositions.stream().map(p -> p.setOrder(cachedOrder)).collect(Collectors.toSet()));

        for (int i = 0; i < 5; i++) {
            System.out.println("gibb it simple" + i);
        }

        cachedOrder.setOrderPositions(cachedOrder.getOrderPositions().stream().map(p -> p.setTea(teaService.findById(p.getTea().getId())) ).collect(Collectors.toSet()));

        for (OrderPosition orderPosition : cachedOrder.getOrderPositions()) {
            Integer reqAge = orderPosition.getTea().getTeaType().getReqAge();
            Integer reqRankWeight = orderPosition.getTea().getTeaType().getReqRankWeight();
            int age = Period.between(userService.findPrincipal().user().getBirthDate(), LocalDate.now()).getYears();
            Integer rankWeight = cachedOrder.getUser().getRank().getWeight();

            Integer stock = orderPosition.getTea().getStock();
            Integer amount = orderPosition.getAmount();

            if (reqAge > age) {
                throw new RuntimeException("too young");
            }
            if (reqRankWeight > rankWeight) {
                throw new RuntimeException("not good rank");
            }
            if (amount > stock) {
                throw new RuntimeException("Not enough tea in stock");
            }

            // orderPosition.getTea().setAmount();
            orderPosition.getTea().setStock(stock - amount);
        }



        // set netto price
        float gross = cachedOrder.getOrderPositions().stream().map(p -> p.getTea().getSellingPrice() * p.getAmount()).reduce(0F, Float::sum); // warum identity
        float discount = cachedOrder.getUser().getRank().getDiscount();
        float net = gross * discount;
        cachedOrder.setPrice(net);

        // set seeds
        float earnedSeedsAsFloat = cachedOrder.getPrice() / 2;
        cachedOrder.getUser().setSeeds((int) earnedSeedsAsFloat + cachedOrder.getUser().getSeeds());

        // get Seeds from db
        Integer dbSeeds = cachedOrder.getUser().getSeeds();

        // set new rank
        List<Rank> ranksList = rankService.findAll().stream().filter( rank -> rank.getRequiredSeeds() <= dbSeeds).sorted(Comparator.comparingInt(Rank::getRequiredSeeds)).toList();
        Rank newRank = ranksList.get(ranksList.size() -1);
        cachedOrder.getUser().setRank(newRank);

        // Rank rank = rankService.findRankBySeeds(order1.getUser().getSeeds());


        return save(cachedOrder);
    }



    @Override
    public List<Order> getOrders(){
        User principal = userService.findPrincipal().user();
        List<Order> orderList = findAll().stream().filter(order -> order.getUser().getId().equals(userService.findPrincipal().user().getId())).toList();
        return orderList;
    }

    @Override
    public List<OwnTea> getOwnTea() {
        Optional<List<OwnTea>> optional = (((OrderRepository) repository).ownTea(userService.findPrincipal().user().getId()));
        if (optional.isPresent()){
            return optional.get();
        } else {
            throw new NoSuchElementException("No value present");
        }
    }


    @Override
    public UUID getPrincipal() {
        return userService.findPrincipal().user().getId();
    }
}