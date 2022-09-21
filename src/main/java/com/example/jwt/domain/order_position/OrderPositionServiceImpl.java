package com.example.jwt.domain.order_position;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class OrderPositionServiceImpl extends ExtendedServiceImpl<OrderPosition> implements OrderPositionService {

    protected OrderPositionServiceImpl(ExtendedRepository<OrderPosition> repository, Logger logger) {
        super(repository, logger);
    }
}
