package com.example.jwt.domain.country;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.order.Order;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl extends ExtendedServiceImpl<Country> implements CountryService {

    protected CountryServiceImpl(ExtendedRepository<Country> repository, Logger logger) {
        super(repository, logger);
    }
}
