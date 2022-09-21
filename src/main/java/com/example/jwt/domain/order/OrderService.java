package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedService;
import org.springframework.transaction.annotation.Transactional;

public interface OrderService extends ExtendedService<Order> {
    @Transactional
    Order createOrder(Order order);
}
