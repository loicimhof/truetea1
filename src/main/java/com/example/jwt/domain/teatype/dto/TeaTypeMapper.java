package com.example.jwt.domain.teatype.dto;

import com.example.jwt.core.generic.ExtendedMapper;
import com.example.jwt.domain.teatype.TeaType;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface TeaTypeMapper extends ExtendedMapper<TeaType, TeaTypeDTO> {
    TeaType fromDTO(TeaTypeDTO dto);

    TeaTypeDTO toDTO(TeaType teaType);
}
