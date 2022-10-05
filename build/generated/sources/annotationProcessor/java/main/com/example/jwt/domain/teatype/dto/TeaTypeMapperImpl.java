package com.example.jwt.domain.teatype.dto;

import com.example.jwt.domain.teatype.TeaType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T11:48:42+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class TeaTypeMapperImpl implements TeaTypeMapper {

    @Override
    public List<TeaType> fromDTOs(List<TeaTypeDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<TeaType> list = new ArrayList<TeaType>( dtos.size() );
        for ( TeaTypeDTO teaTypeDTO : dtos ) {
            list.add( fromDTO( teaTypeDTO ) );
        }

        return list;
    }

    @Override
    public Set<TeaType> fromDTOs(Set<TeaTypeDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<TeaType> set = new LinkedHashSet<TeaType>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( TeaTypeDTO teaTypeDTO : dtos ) {
            set.add( fromDTO( teaTypeDTO ) );
        }

        return set;
    }

    @Override
    public List<TeaTypeDTO> toDTOs(List<TeaType> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<TeaTypeDTO> list = new ArrayList<TeaTypeDTO>( BOs.size() );
        for ( TeaType teaType : BOs ) {
            list.add( toDTO( teaType ) );
        }

        return list;
    }

    @Override
    public Set<TeaTypeDTO> toDTOs(Set<TeaType> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<TeaTypeDTO> set = new LinkedHashSet<TeaTypeDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( TeaType teaType : BOs ) {
            set.add( toDTO( teaType ) );
        }

        return set;
    }

    @Override
    public TeaType fromDTO(TeaTypeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TeaType teaType = new TeaType();

        teaType.setId( dto.getId() );
        teaType.setName( dto.getName() );

        return teaType;
    }

    @Override
    public TeaTypeDTO toDTO(TeaType teaType) {
        if ( teaType == null ) {
            return null;
        }

        TeaTypeDTO teaTypeDTO = new TeaTypeDTO();

        teaTypeDTO.setId( teaType.getId() );
        teaTypeDTO.setName( teaType.getName() );

        return teaTypeDTO;
    }
}
