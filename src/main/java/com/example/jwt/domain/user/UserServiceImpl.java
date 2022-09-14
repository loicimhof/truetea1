package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.rank.RankRepository;
import com.example.jwt.domain.rank.RankService;
import com.example.jwt.domain.role.RoleService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Service
public class UserServiceImpl extends ExtendedServiceImpl<User> implements UserService {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    private RankService rankService;
    private RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository repository, Logger logger, BCryptPasswordEncoder bCryptPasswordEncoder) {
        super(repository, logger);
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return ((UserRepository) repository).findByEmail(email).map(UserDetailsImpl::new).orElseThrow(() -> new UsernameNotFoundException(email));
    }


    @Override
    public User register(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));

        user.setRank(rankService.findByName("silver"));
        user.setRoles(new HashSet<>(Arrays.asList(roleService.findByName("ROLE_ADMIN"))));
        return save(user);
    }
}
