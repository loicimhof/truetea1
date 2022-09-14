package com.example.jwt.domain.order.dto;

import com.example.jwt.domain.order.Order;
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
public class OrderMapperImpl implements OrderMapper {

    @Override
    public List<Order> fromDTOs(List<OrderDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Order> list = new ArrayList<Order>( dtos.size() );
        for ( OrderDTO orderDTO : dtos ) {
            list.add( fromDTO( orderDTO ) );
        }

        return list;
    }

    @Override
    public Set<Order> fromDTOs(Set<OrderDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Order> set = new LinkedHashSet<Order>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( OrderDTO orderDTO : dtos ) {
            set.add( fromDTO( orderDTO ) );
        }

        return set;
    }

    @Override
    public List<OrderDTO> toDTOs(List<Order> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<OrderDTO> list = new ArrayList<OrderDTO>( BOs.size() );
        for ( Order order : BOs ) {
            list.add( toDTO( order ) );
        }

        return list;
    }

    @Override
    public Set<OrderDTO> toDTOs(Set<Order> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<OrderDTO> set = new LinkedHashSet<OrderDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Order order : BOs ) {
            set.add( toDTO( order ) );
        }

        return set;
    }

    @Override
    public Order fromDTO(OrderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( dto.getId() );
        order.setDate_bought( dto.getDate_bought() );
        order.setReduction( dto.getReduction() );
        order.setFinal_price( dto.getFinal_price() );

        return order;
    }

    @Override
    public OrderDTO toDTO(Order orders) {
        if ( orders == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId( orders.getId() );
        orderDTO.setDate_bought( orders.getDate_bought() );
        orderDTO.setReduction( orders.getReduction() );
        orderDTO.setFinal_price( orders.getFinal_price() );

        return orderDTO;
    }
}
