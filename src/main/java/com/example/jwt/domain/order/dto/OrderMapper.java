package com.example.jwt.domain.order.dto;


import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.order.Order;
import com.example.jwt.domain.order_position.OrderPosition;
import com.example.jwt.domain.tea.Tea;
import com.example.jwt.domain.teatype.TeaType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderMapper extends ExtendedMapper<Order, OrderDTO> {
    // Order fromDTO (OrderDTO dto);
    // OrderDTO toDTO (Order orders);
}
