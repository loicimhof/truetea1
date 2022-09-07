package com.example.jwt.domain.order_tea;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class OrderTeaServiceImpl extends ExtendedServiceImpl<OrderTea> implements OrderTeaService {

    protected OrderTeaServiceImpl(ExtendedRepository<OrderTea> repository, Logger logger) {
        super(repository, logger);
    }
}
