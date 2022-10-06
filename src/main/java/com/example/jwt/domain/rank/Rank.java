package com.example.jwt.domain.rank;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.user.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "rank")
public class Rank extends ExtendedEntity {

    @OneToMany(mappedBy = "rank")
    Set<User> users = new HashSet<>();
    @Column(name = "name")
    private String name;
    @Column(name = "required_seeds")
    private Integer requiredSeeds;
    @Column(name = "discount", nullable = false)
    private Float discount;
    @Column(name = "weight")
    private Integer weight;


    public Rank() {
    }

    public Rank(UUID id, String name, Integer requiredSeeds, Float discount, Integer weight, Set<User> users) {
        super(id);
        this.name = name;
        this.requiredSeeds = requiredSeeds;
        this.discount = discount;
        this.weight = weight;
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public Rank setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getRequiredSeeds() {
        return requiredSeeds;
    }

    public Rank setRequiredSeeds(Integer requiredSeeds) {
        this.requiredSeeds = requiredSeeds;
        return this;
    }

    public Float getDiscount() {
        return discount;
    }

    public Rank setDiscount(Float discount) {
        this.discount = discount;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public Rank setWeight(Integer weight) {
        this.weight = weight;
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
