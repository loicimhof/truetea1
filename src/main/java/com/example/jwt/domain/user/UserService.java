package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.rank.Rank;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService, ExtendedService<User> {
    UserDetailsImpl findPrincipal();

    User register(User user);

    User getShoppingQueen();
}
