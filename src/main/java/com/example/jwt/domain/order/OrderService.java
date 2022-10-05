package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.order.dto.OwnTea;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

public interface OrderService extends ExtendedService<Order> {
    @Transactional
    Order createOrder(Order order) throws Exception;

    List<Order> getOrders();

    List<OwnTea> getOwnTea();

    UUID getPrincipal();
}
