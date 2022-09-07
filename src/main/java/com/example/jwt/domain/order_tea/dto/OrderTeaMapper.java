package com.example.jwt.domain.order_tea.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.order_tea.OrderTea;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface OrderTeaMapper extends ExtendedMapper<OrderTea, OrderTeaDTO> {
    OrderTea fromDTO (OrderTeaDTO dto);
    OrderTeaDTO toDTO (OrderTea orderTea);
}
