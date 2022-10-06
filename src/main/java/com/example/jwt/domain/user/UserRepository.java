package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends ExtendedRepository<User> {
    Optional<User> findByEmail(String email);


    @Query(value = "select u.* from users u, orders o, order_positions op where u.id = o.users_id and o.id = op.order_id group by u.first_name, u.id, u.created_at, u.modified_at, birth_date, email, last_name, password, seeds, u.created_by, u.last_modified_by, rank_id order by sum(op.amount) desc limit 1;\n", nativeQuery = true)
    User getShoppingQueen();


    @Query(value = "select sum(discount) from orders where created_at >= current_date - interval '1'MONTH ", nativeQuery = true)
    Float getDiscount();
}
