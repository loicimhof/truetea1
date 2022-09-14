package com.example.jwt.domain.role;

import com.example.jwt.core.generic.ExtendedService;
import com.example.jwt.domain.rank.Rank;

public interface RoleService extends ExtendedService<Role> {
    Role findByName(String name);
}
