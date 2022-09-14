package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.user.User;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "orders")
public class Order extends ExtendedEntity {

    @Column(name = "date_bought")
    private Date date_bought;

    @Column(name = "reduction")
    private Long reduction;

    @Column(name = "discount")
    private Long final_price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "users_id", referencedColumnName = "id")
    private User user;


    public Order() {
    }

    public Order(UUID id, Date date_bought, Long reduction, Long final_price, User user) {
        super(id);
        this.date_bought = date_bought;
        this.reduction = reduction;
        this.final_price = final_price;
        this.user = user;
    }

    public Date getDate_bought() {
        return date_bought;
    }

    public Order setDate_bought(Date date_bought) {
        this.date_bought = date_bought;
        return this;
    }

    public Long getReduction() {
        return reduction;
    }

    public Order setReduction(Long reduction) {
        this.reduction = reduction;
        return this;
    }

    public Long getFinal_price() {
        return final_price;
    }

    public Order setFinal_price(Long final_price) {
        this.final_price = final_price;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Order setUser(User user) {
        this.user = user;
        return this;
    }
}
