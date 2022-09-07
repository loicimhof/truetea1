package com.example.jwt.domain.order_tea;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "order_tea")
public class OrderTea extends ExtendedEntity {

    @Column(name = "amount")
    private Long amount;

    @Column(name = "price")
    private Long price;

    public OrderTea() {
    }

    public OrderTea(UUID id, Long amount, Long price) {
        super(id);
        this.amount = amount;
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public OrderTea setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public OrderTea setPrice(Long price) {
        this.price = price;
        return this;
    }
}
