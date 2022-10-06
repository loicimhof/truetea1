package com.example.jwt.domain.tea;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TeaServiceImpl extends ExtendedServiceImpl<Tea> implements TeaService {

    protected TeaServiceImpl(ExtendedRepository<Tea> repository, Logger logger) {
        super(repository, logger);
    }
}
