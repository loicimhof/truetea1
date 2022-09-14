package com.example.jwt.domain.rank;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.user.User;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "rank")
public class Rank extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "required_seeds")
    private Long requiredSeeds;

    @Column(name = "discount")
    private Long discount;

    @OneToMany(mappedBy = "rank")
    Set<User> users = new HashSet<>();


    public Rank() {
    }

    public Rank(UUID id, String name, Long requiredSeeds, Long discount, Set<User> users) {
        super(id);
        this.name = name;
        this.requiredSeeds = requiredSeeds;
        this.discount = discount;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public Rank setName(String name) {
        this.name = name;
        return this;
    }

    public Long getRequiredSeeds() {
        return requiredSeeds;
    }

    public Rank setRequiredSeeds(Long requiredSeeds) {
        this.requiredSeeds = requiredSeeds;
        return this;
    }

    public Long getDiscount() {
        return discount;
    }

    public Rank setDiscount(Long discount) {
        this.discount = discount;
        return this;
    }

    public Set<User> getUsers() {
        return users;
    }

    public Rank setUsers(Set<User> users) {
        this.users = users;
        return this;
    }
}
