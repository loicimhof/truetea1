package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService extends ExtendedService<Order> {
    @Transactional
    Order createOrder(Order order);

    List<Order> getOrders();
}
