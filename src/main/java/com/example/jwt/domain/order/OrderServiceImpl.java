package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl extends ExtendedServiceImpl<Order> implements OrderService {

    protected OrderServiceImpl(ExtendedRepository<Order> repository, Logger logger) {
        super(repository, logger);
    }
}
