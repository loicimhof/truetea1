package com.example.jwt.domain.order.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.order_position.dto.OrderPositionDTO;
import com.example.jwt.domain.user.dto.UserDTO;

import java.util.Set;
import java.util.UUID;

public class OrderDTO extends ExtendedDTO {

    private Long price;

    private UserDTO user;

    private Set<OrderPositionDTO> orderPositions;

    public OrderDTO() {
    }

    public OrderDTO(UUID id, Long price, UserDTO user, Set<OrderPositionDTO> orderPositions) {
        super(id);
        this.price = price;
        this.user = user;
        this.orderPositions = orderPositions;
    }

    public Long getPrice() {
        return price;
    }

    public OrderDTO setPrice(Long price) {
        this.price = price;
        return this;
    }

    public UserDTO getUser() {
        return user;
    }

    public OrderDTO setUser(UserDTO user) {
        this.user = user;
        return this;
    }

    public Set<OrderPositionDTO> getOrderPositions() {
        return orderPositions;
    }

    public OrderDTO setOrderPositions(Set<OrderPositionDTO> orderPositions) {
        this.orderPositions = orderPositions;
        return this;
    }
}