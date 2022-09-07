package com.example.jwt.domain.teatype;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class TeaTypeServiceImpl extends ExtendedServiceImpl<TeaType> implements TeaTypeService {

    protected TeaTypeServiceImpl(ExtendedRepository<TeaType> repository, Logger logger) {
        super(repository, logger);
    }
}
