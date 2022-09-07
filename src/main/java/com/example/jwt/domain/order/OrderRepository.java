package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends ExtendedRepository<Order> {
}
