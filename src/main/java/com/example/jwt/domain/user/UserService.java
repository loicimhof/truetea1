package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.UUID;

public interface UserService extends UserDetailsService, ExtendedService<User> {
    UserDetailsImpl findPrincipal();

    User register(User user);

    User getShoppingQueen();

    Float getDiscount();

    User lockUser(UUID id);

    User unlockUser(UUID id);
}
