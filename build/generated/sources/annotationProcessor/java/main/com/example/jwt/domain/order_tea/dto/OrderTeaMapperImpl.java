package com.example.jwt.domain.order_tea.dto;

import com.example.jwt.domain.order_tea.OrderTea;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-07T16:33:11+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class OrderTeaMapperImpl implements OrderTeaMapper {

    @Override
    public List<OrderTea> fromDTOs(List<OrderTeaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<OrderTea> list = new ArrayList<OrderTea>( dtos.size() );
        for ( OrderTeaDTO orderTeaDTO : dtos ) {
            list.add( fromDTO( orderTeaDTO ) );
        }

        return list;
    }

    @Override
    public Set<OrderTea> fromDTOs(Set<OrderTeaDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<OrderTea> set = new LinkedHashSet<OrderTea>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( OrderTeaDTO orderTeaDTO : dtos ) {
            set.add( fromDTO( orderTeaDTO ) );
        }

        return set;
    }

    @Override
    public List<OrderTeaDTO> toDTOs(List<OrderTea> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<OrderTeaDTO> list = new ArrayList<OrderTeaDTO>( BOs.size() );
        for ( OrderTea orderTea : BOs ) {
            list.add( toDTO( orderTea ) );
        }

        return list;
    }

    @Override
    public Set<OrderTeaDTO> toDTOs(Set<OrderTea> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<OrderTeaDTO> set = new LinkedHashSet<OrderTeaDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( OrderTea orderTea : BOs ) {
            set.add( toDTO( orderTea ) );
        }

        return set;
    }

    @Override
    public OrderTea fromDTO(OrderTeaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrderTea orderTea = new OrderTea();

        orderTea.setId( dto.getId() );
        orderTea.setAmount( dto.getAmount() );
        orderTea.setPrice( dto.getPrice() );

        return orderTea;
    }

    @Override
    public OrderTeaDTO toDTO(OrderTea orderTea) {
        if ( orderTea == null ) {
            return null;
        }

        OrderTeaDTO orderTeaDTO = new OrderTeaDTO();

        orderTeaDTO.setId( orderTea.getId() );
        orderTeaDTO.setAmount( orderTea.getAmount() );
        orderTeaDTO.setPrice( orderTea.getPrice() );

        return orderTeaDTO;
    }
}
