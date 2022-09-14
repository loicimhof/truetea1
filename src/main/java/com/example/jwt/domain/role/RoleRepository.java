package com.example.jwt.domain.role;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.rank.Rank;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface RoleRepository extends ExtendedRepository<Role> {

    Optional<Role> findByName(String name);


}
