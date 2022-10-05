package com.example.jwt.domain.tea.dto;

import com.example.jwt.domain.tea.Tea;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T15:42:18+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class TeaMapperImpl implements TeaMapper {

    @Override
    public List<Tea> fromDTOs(List<TeaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Tea> list = new ArrayList<Tea>( dtos.size() );
        for ( TeaDTO teaDTO : dtos ) {
            list.add( fromDTO( teaDTO ) );
        }

        return list;
    }

    @Override
    public Set<Tea> fromDTOs(Set<TeaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Tea> set = new LinkedHashSet<Tea>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( TeaDTO teaDTO : dtos ) {
            set.add( fromDTO( teaDTO ) );
        }

        return set;
    }

    @Override
    public List<TeaDTO> toDTOs(List<Tea> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<TeaDTO> list = new ArrayList<TeaDTO>( BOs.size() );
        for ( Tea tea : BOs ) {
            list.add( toDTO( tea ) );
        }

        return list;
    }

    @Override
    public Set<TeaDTO> toDTOs(Set<Tea> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<TeaDTO> set = new LinkedHashSet<TeaDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Tea tea : BOs ) {
            set.add( toDTO( tea ) );
        }

        return set;
    }

    @Override
    public Tea fromDTO(TeaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Tea tea = new Tea();

        tea.setId( dto.getId() );
        tea.setName( dto.getName() );
        tea.setDescription( dto.getDescription() );
        if ( dto.getSellingPrice() != null ) {
            tea.setSellingPrice( Float.parseFloat( dto.getSellingPrice() ) );
        }
        tea.setHarvestDate( dto.getHarvestDate() );

        return tea;
    }

    @Override
    public TeaDTO toDTO(Tea teas) {
        if ( teas == null ) {
            return null;
        }

        TeaDTO teaDTO = new TeaDTO();

        teaDTO.setId( teas.getId() );
        teaDTO.setName( teas.getName() );
        teaDTO.setDescription( teas.getDescription() );
        if ( teas.getSellingPrice() != null ) {
            teaDTO.setSellingPrice( String.valueOf( teas.getSellingPrice() ) );
        }
        teaDTO.setHarvestDate( teas.getHarvestDate() );

        return teaDTO;
    }
}
