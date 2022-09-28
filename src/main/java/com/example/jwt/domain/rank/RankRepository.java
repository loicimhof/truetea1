package com.example.jwt.domain.rank;

import com.example.jwt.core.generic.ExtendedRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RankRepository extends ExtendedRepository<Rank> {

    Optional<Rank> findByName(String name);


}
