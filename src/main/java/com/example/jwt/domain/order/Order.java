package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedAuditEntity;

import com.example.jwt.domain.order_position.OrderPosition;
import com.example.jwt.domain.user.User;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order extends ExtendedAuditEntity {

    @Column(name = "price")
    private Float price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "users_id", referencedColumnName = "id", nullable = false)
    private User user;


    @JsonBackReference(value = "order_orderPosition")
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<OrderPosition> orderPositions;


    public Order() {
    }

    public Order(UUID id, Float price, User user, Set<OrderPosition> orderPositions) {
        super(id);
        this.price = price;
        this.user = user;
        this.orderPositions = orderPositions;
    }

    public Float getPrice() {
        return price;
    }

    public Order setPrice(Float price) {
        this.price = price;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Order setUser(User user) {
        this.user = user;
        return this;
    }

    public Set<OrderPosition> getOrderPositions() {
        return orderPositions;
    }

    public Order setOrderPositions(Set<OrderPosition> orderPositions) {
        this.orderPositions = orderPositions;
        return this;
    }
}
