package com.example.jwt.domain.role;

import com.example.jwt.core.generic.ExtendedRepository;
import com.example.jwt.core.generic.ExtendedServiceImpl;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;


@Service
public class RoleServiceImpl extends ExtendedServiceImpl<Role> implements RoleService {

    protected RoleServiceImpl(ExtendedRepository<Role> repository, Logger logger) {
        super(repository, logger);
    }

    @Override
    public Role findByName(String name) {
        return findOrThrow(((RoleRepository) repository).findByName(name));
    }


}
