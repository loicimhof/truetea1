package com.example.jwt.domain.rank;

import com.example.jwt.core.generic.ExtendedService;

import java.util.Optional;

public interface RankService extends ExtendedService<Rank> {
    Rank findByName(String name);
}
