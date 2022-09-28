package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedServiceImpl;
import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.rank.RankService;
import com.example.jwt.domain.role.RoleService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;

@Service
public class UserServiceImpl extends ExtendedServiceImpl<User> implements UserService {

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    private final RankService rankService;
    private final RoleService roleService;

    @Autowired
    public UserServiceImpl(UserRepository repository, Logger logger, BCryptPasswordEncoder bCryptPasswordEncoder,RankService rankService, RoleService roleService) {
        super(repository, logger);
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
        this.rankService = rankService;
        this.roleService = roleService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return ((UserRepository) repository).findByEmail(email).map(UserDetailsImpl::new).orElseThrow(() -> new UsernameNotFoundException(email));
    }

    @Override
    public UserDetailsImpl findPrincipal() {
        return ((UserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }






    @Override
    public User register(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setSeeds(0);
        user.setRank(rankService.findByName("silver"));
        user.setRoles(new HashSet<>(Arrays.asList(roleService.findByName("ROLE_ADMIN"))));
        return save(user);
    }
}
