package com.example.jwt.domain.order_tea.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.order_tea.OrderPosition;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderTeaMapper extends ExtendedMapper<OrderPosition, OrderPositionDTO> {
    OrderPosition fromDTO (OrderPositionDTO dto);
    OrderPositionDTO toDTO (OrderPosition orderPosition);
}
