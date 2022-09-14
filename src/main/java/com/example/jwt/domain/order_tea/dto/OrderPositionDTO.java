package com.example.jwt.domain.order_tea.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import java.util.UUID;

public class OrderPositionDTO extends ExtendedDTO{

    private Long amount;

    private Long price;


    public OrderPositionDTO() {
    }

    public OrderPositionDTO(UUID id, Long amount, Long price) {
        super(id);
        this.amount = amount;
        this.price = price;
    }

    public Long getAmount() {
        return amount;
    }

    public OrderPositionDTO setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public OrderPositionDTO setPrice(Long price) {
        this.price = price;
        return this;
    }
}
