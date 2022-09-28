package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.order_position.OrderPosition;

import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.rank.RankService;
import com.example.jwt.domain.tea.TeaService;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl extends ExtendedServiceImpl<Order> implements OrderService {

    TeaService teaService;
    UserService userService;
    RankService rankService;


    @Autowired
    public OrderServiceImpl(ExtendedRepository<Order> repository, Logger logger, TeaService teaService, UserService userService, RankService rankService) {
        super(repository, logger);
        this.teaService = teaService;
        this.userService = userService;
        this.rankService = rankService;
    }

    @Override
    @Transactional
    public Order createOrder(Order order) {
        Set<OrderPosition> detachedPositions = order.getOrderPositions();
        Order cachedOrder = save(order.setOrderPositions(new HashSet<>()).setUser(userService.findPrincipal().user()));
        cachedOrder.setOrderPositions(detachedPositions.stream().map(p -> p.setOrder(cachedOrder)).collect(Collectors.toSet()));

        Order order1 = save(cachedOrder);

        for (int i = 0; i < 5; i++) {
            System.out.println("gibb it simple" + i);
        }

        order1.setOrderPositions(order1.getOrderPositions().stream().map(p -> p.setTea(teaService.findById(p.getTea().getId()))).collect(Collectors.toSet()));

        // set netto price
        float brutto = order1.getOrderPositions().stream().map(p -> p.getTea().getSellingPrice() * p.getAmount()).reduce(0F, Float::sum); // warum identity
        float discount = cachedOrder.getUser().getRank().getDiscount();
        float netto = brutto * discount;
        order1.setPrice(netto);

        // set seeds
        float earnedSeedsAsFloat = order1.getPrice() / 2;
        order1.getUser().setSeeds((int) earnedSeedsAsFloat + order1.getUser().getSeeds());


        // get Seeds from db
        Integer dbSeeds = order1.getUser().getSeeds();

        // set new rank
        List<Rank> ranksList = rankService.findAll().stream().filter( rank -> rank.getRequiredSeeds() < dbSeeds).sorted(Comparator.comparingInt(Rank::getRequiredSeeds)).toList();
        Rank newRank = ranksList.get(ranksList.size()-1);
        order1.getUser().setRank(newRank);


        /*
        Set<Order> orderSet = order1.getUser().getOrders();
        System.out.println(orderSet);


         */

        /*
        7) Ein Benutzer muss all seine getätigten Bestellungen einsehen können
         */

        return save(order1);
    }


    @Override
    public List<Order> getOrders(){
        // List<Order> orderSet = userService.findPrincipal().user().getOrders().stream().toList();
        // System.out.println(orderSet);
        User principal = userService.findPrincipal().user();

        List<Order> orderList = findAll().stream().filter(order -> order.getUser().getId().equals(userService.findPrincipal().user().getId())).toList();
        return orderList;
    }


}