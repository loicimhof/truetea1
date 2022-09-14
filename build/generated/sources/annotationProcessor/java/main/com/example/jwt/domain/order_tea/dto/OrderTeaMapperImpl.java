package com.example.jwt.domain.order_tea.dto;

import com.example.jwt.domain.order_tea.OrderPosition;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-14T10:45:39+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class OrderTeaMapperImpl implements OrderTeaMapper {

    @Override
    public List<OrderPosition> fromDTOs(List<OrderPositionDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<OrderPosition> list = new ArrayList<OrderPosition>( dtos.size() );
        for ( OrderPositionDTO orderPositionDTO : dtos ) {
            list.add( fromDTO( orderPositionDTO ) );
        }

        return list;
    }

    @Override
    public Set<OrderPosition> fromDTOs(Set<OrderPositionDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<OrderPosition> set = new LinkedHashSet<OrderPosition>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( OrderPositionDTO orderPositionDTO : dtos ) {
            set.add( fromDTO( orderPositionDTO ) );
        }

        return set;
    }

    @Override
    public List<OrderPositionDTO> toDTOs(List<OrderPosition> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<OrderPositionDTO> list = new ArrayList<OrderPositionDTO>( BOs.size() );
        for ( OrderPosition orderPosition : BOs ) {
            list.add( toDTO( orderPosition ) );
        }

        return list;
    }

    @Override
    public Set<OrderPositionDTO> toDTOs(Set<OrderPosition> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<OrderPositionDTO> set = new LinkedHashSet<OrderPositionDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( OrderPosition orderPosition : BOs ) {
            set.add( toDTO( orderPosition ) );
        }

        return set;
    }

    @Override
    public OrderPosition fromDTO(OrderPositionDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrderPosition orderPosition = new OrderPosition();

        orderPosition.setId( dto.getId() );
        orderPosition.setAmount( dto.getAmount() );
        orderPosition.setPrice( dto.getPrice() );

        return orderPosition;
    }

    @Override
    public OrderPositionDTO toDTO(OrderPosition orderPosition) {
        if ( orderPosition == null ) {
            return null;
        }

        OrderPositionDTO orderPositionDTO = new OrderPositionDTO();

        orderPositionDTO.setId( orderPosition.getId() );
        orderPositionDTO.setAmount( orderPosition.getAmount() );
        orderPositionDTO.setPrice( orderPosition.getPrice() );

        return orderPositionDTO;
    }
}
