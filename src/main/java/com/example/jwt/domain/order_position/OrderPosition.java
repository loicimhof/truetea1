package com.example.jwt.domain.order_position;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.order.Order;
import com.example.jwt.domain.tea.Tea;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "order_positions")
public class OrderPosition extends ExtendedEntity {

    @Column(name = "amount")
    private Integer amount;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tea_id", referencedColumnName = "id")
    private Tea tea;

    public OrderPosition() {
    }

    public OrderPosition(UUID id, Integer amount, Order order, Tea tea) {
        super(id);
        this.amount = amount;
        this.order = order;
        this.tea = tea;
    }

    public Integer getAmount() {
        return amount;
    }

    public OrderPosition setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Order getOrder() {
        return order;
    }

    public OrderPosition setOrder(Order order) {
        this.order = order;
        return this;
    }

    public Tea getTea() {
        return tea;
    }

    public OrderPosition setTea(Tea tea) {
        this.tea = tea;
        return this;
    }
}
