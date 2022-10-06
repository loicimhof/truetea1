package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.rank.Rank;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public interface UserService extends UserDetailsService, ExtendedService<User> {
    UserDetailsImpl findPrincipal();

    User register(User user);

    User getShoppingQueen();

    Float getDiscount();

    User lockUser(UUID id);

    User unlockUser(UUID id);
}
