package com.example.jwt.domain.order_position.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.tea.dto.TeaDTO;

import java.util.UUID;

public class OrderPositionDTO extends ExtendedDTO {

    private Long amount;


    private TeaDTO tea;


    public OrderPositionDTO() {
    }

    public OrderPositionDTO(UUID id, Long amount, TeaDTO tea) {
        super(id);
        this.amount = amount;
        this.tea = tea;
    }

    public Long getAmount() {
        return amount;
    }

    public OrderPositionDTO setAmount(Long amount) {
        this.amount = amount;
        return this;
    }

    public TeaDTO getTea() {
        return tea;
    }

    public OrderPositionDTO setTea(TeaDTO tea) {
        this.tea = tea;
        return this;
    }
}