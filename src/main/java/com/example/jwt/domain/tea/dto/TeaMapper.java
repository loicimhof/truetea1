package com.example.jwt.domain.tea.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.tea.Tea;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TeaMapper extends ExtendedMapper<Tea, TeaDTO> {
    Tea fromDTO (TeaDTO dto);
    TeaDTO toDTO (Tea teas);
}
