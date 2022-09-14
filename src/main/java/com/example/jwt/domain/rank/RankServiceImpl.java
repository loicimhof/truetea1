package com.example.jwt.domain.rank;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;


@Service
public class RankServiceImpl extends ExtendedServiceImpl<Rank> implements RankService {

    protected RankServiceImpl(ExtendedRepository<Rank> repository, Logger logger) {
        super(repository, logger);
    }

    @Override
    public Rank findByName(String name) {
        return findOrThrow(((RankRepository) repository).findByName(name));
    }


}
