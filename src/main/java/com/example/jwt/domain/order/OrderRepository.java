package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.domain.order.dto.OwnTea;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface OrderRepository extends ExtendedRepository<Order> {
    @Query(value = "select sum(op.amount) as amount, tt.name as category, t. name as tea from users u, orders o, order_positions op, tea t, tea_type tt where u.id = o.users_id and o.id = op.order_id and op.tea_id = t.id and t.tea_type_id = tt.id and u.id = :principal group by tt.name, t.name;", nativeQuery = true)
    Optional<List<OwnTea>> ownTea(@Param("principal") UUID principal);

}
