package com.example.jwt.domain.user;

import com.example.jwt.core.generic.ExtendedAuditEntity;
import com.example.jwt.domain.order.Order;
import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.role.Role;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User extends ExtendedAuditEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "seeds")
    private Long seeds;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_role",
            joinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rank_id", referencedColumnName = "id")
    private Rank rank;


    @JsonBackReference(value = "users_orders")
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<Order> orders;

    public User() {
    }

    public User(UUID id, String firstName, String lastName, String email, String password, Long seeds, Set<Role> roles, Rank rank, Set<Order> orders) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.seeds = seeds;
        this.roles = roles;
        this.rank = rank;
        this.orders = orders;
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Long getSeeds() {
        return seeds;
    }

    public User setSeeds(Long seeds) {
        this.seeds = seeds;
        return this;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public User setRoles(Set<Role> roles) {
        this.roles = roles;
        return this;
    }

    public Rank getRank() {
        return rank;
    }

    public User setRank(Rank rank) {
        this.rank = rank;
        return this;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public User setOrders(Set<Order> orders) {
        this.orders = orders;
        return this;
    }
}