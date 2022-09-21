package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.order_position.OrderPosition;
import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.tea.TeaService;
import com.example.jwt.domain.user.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl extends ExtendedServiceImpl<Order> implements OrderService {

    TeaService teaService;
    UserService userService;


    @Autowired
    public OrderServiceImpl(ExtendedRepository<Order> repository, Logger logger, TeaService teaService, UserService userService) {
        super(repository, logger);
        this.teaService = teaService;
        this.userService = userService;
    }

    @Override
    @Transactional
    public Order createOrder(Order order) {
        Set<OrderPosition> detachedPositions = order.getOrderPositions();
        Order cachedOrder = save(order.setOrderPositions(new HashSet<>()).setUser(userService.findPrincipal().user()));
        cachedOrder.setOrderPositions(detachedPositions.stream().map(p -> p.setOrder(cachedOrder)).collect(Collectors.toSet()));

        Order order1 = save(cachedOrder);

        order1.setOrderPositions(order1.getOrderPositions().stream().map(p -> p.setTea(teaService.findById(p.getTea().getId()))).collect(Collectors.toSet()));


        float brutto = order1.getOrderPositions().stream().map(p -> p.getTea().getSellingPrice() * p.getAmount()).reduce(1234F, Float::sum); // warum 13 und cast?
        //   .reduce(0, (subtotal, element) -> subtotal + element);
        float discount = cachedOrder.getUser().getRank().getDiscount();
        float netto = brutto * discount;

        order1.setPrice(netto);

        Float earnedSeeds = order1.getPrice() / 2;

        order1.getUser().setSeeds((long) (order1.getUser().getSeeds() + earnedSeeds));

        /*
        Rank newRank = order1.getUser().getSeeds()
        order1.getUser().setRank(newRank);

         */


        System.out.println("brutto = " + brutto);
        System.out.println("netto = " + netto);
        System.out.println("earnedSeeds = " + earnedSeeds);

        System.out.println("gibb it simple");
        return save(order1);
    }

}


/*
5) Bei einer Bestellung müssen Verbilligungen durch allfällige Ränke
miteinberechnet werden.

Durch die Bestellung erwirtschaftete Seeds
werden basierend auf dem Netto- und nicht Bruttopreis berechnet
 */