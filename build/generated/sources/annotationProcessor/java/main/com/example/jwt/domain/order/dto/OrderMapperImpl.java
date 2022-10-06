package com.example.jwt.domain.order.dto;

import com.example.jwt.domain.order.Order;
import com.example.jwt.domain.order_position.OrderPosition;
import com.example.jwt.domain.order_position.dto.OrderPositionDTO;
import com.example.jwt.domain.role.Role;
import com.example.jwt.domain.role.dto.RoleDTO;
import com.example.jwt.domain.tea.Tea;
import com.example.jwt.domain.tea.dto.TeaDTO;
import com.example.jwt.domain.user.User;
import com.example.jwt.domain.user.dto.UserDTO;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-06T11:08:10+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order fromDTO(OrderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Order order = new Order();

        order.setId( dto.getId() );
        if ( dto.getPrice() != null ) {
            order.setPrice( dto.getPrice().floatValue() );
        }
        order.setUser( userDTOToUser( dto.getUser() ) );
        order.setOrderPositions( orderPositionDTOSetToOrderPositionSet( dto.getOrderPositions() ) );

        return order;
    }

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
    public OrderDTO toDTO(Order BO) {
        if ( BO == null ) {
            return null;
        }

        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setId( BO.getId() );
        if ( BO.getPrice() != null ) {
            orderDTO.setPrice( BO.getPrice().longValue() );
        }
        orderDTO.setUser( userToUserDTO( BO.getUser() ) );
        orderDTO.setOrderPositions( orderPositionSetToOrderPositionDTOSet( BO.getOrderPositions() ) );

        return orderDTO;
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

    protected Role roleDTOToRole(RoleDTO roleDTO) {
        if ( roleDTO == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( roleDTO.getId() );
        role.setName( roleDTO.getName() );

        return role;
    }

    protected Set<Role> roleDTOSetToRoleSet(Set<RoleDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new LinkedHashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : set ) {
            set1.add( roleDTOToRole( roleDTO ) );
        }

        return set1;
    }

    protected User userDTOToUser(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        User user = new User();

        user.setId( userDTO.getId() );
        user.setFirstName( userDTO.getFirstName() );
        user.setLastName( userDTO.getLastName() );
        user.setEmail( userDTO.getEmail() );
        user.setSeeds( userDTO.getSeeds() );
        user.setRoles( roleDTOSetToRoleSet( userDTO.getRoles() ) );

        return user;
    }

    protected Tea teaDTOToTea(TeaDTO teaDTO) {
        if ( teaDTO == null ) {
            return null;
        }

        Tea tea = new Tea();

        tea.setId( teaDTO.getId() );
        tea.setName( teaDTO.getName() );
        tea.setDescription( teaDTO.getDescription() );
        if ( teaDTO.getSellingPrice() != null ) {
            tea.setSellingPrice( Float.parseFloat( teaDTO.getSellingPrice() ) );
        }
        tea.setHarvestDate( teaDTO.getHarvestDate() );

        return tea;
    }

    protected OrderPosition orderPositionDTOToOrderPosition(OrderPositionDTO orderPositionDTO) {
        if ( orderPositionDTO == null ) {
            return null;
        }

        OrderPosition orderPosition = new OrderPosition();

        orderPosition.setId( orderPositionDTO.getId() );
        if ( orderPositionDTO.getAmount() != null ) {
            orderPosition.setAmount( orderPositionDTO.getAmount().intValue() );
        }
        orderPosition.setTea( teaDTOToTea( orderPositionDTO.getTea() ) );

        return orderPosition;
    }

    protected Set<OrderPosition> orderPositionDTOSetToOrderPositionSet(Set<OrderPositionDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<OrderPosition> set1 = new LinkedHashSet<OrderPosition>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( OrderPositionDTO orderPositionDTO : set ) {
            set1.add( orderPositionDTOToOrderPosition( orderPositionDTO ) );
        }

        return set1;
    }

    protected RoleDTO roleToRoleDTO(Role role) {
        if ( role == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( role.getId() );
        roleDTO.setName( role.getName() );

        return roleDTO;
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new LinkedHashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleToRoleDTO( role ) );
        }

        return set1;
    }

    protected UserDTO userToUserDTO(User user) {
        if ( user == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( user.getId() );
        userDTO.setFirstName( user.getFirstName() );
        userDTO.setLastName( user.getLastName() );
        userDTO.setEmail( user.getEmail() );
        userDTO.setRoles( roleSetToRoleDTOSet( user.getRoles() ) );
        userDTO.setSeeds( user.getSeeds() );

        return userDTO;
    }

    protected TeaDTO teaToTeaDTO(Tea tea) {
        if ( tea == null ) {
            return null;
        }

        TeaDTO teaDTO = new TeaDTO();

        teaDTO.setId( tea.getId() );
        teaDTO.setName( tea.getName() );
        teaDTO.setDescription( tea.getDescription() );
        if ( tea.getSellingPrice() != null ) {
            teaDTO.setSellingPrice( String.valueOf( tea.getSellingPrice() ) );
        }
        teaDTO.setHarvestDate( tea.getHarvestDate() );

        return teaDTO;
    }

    protected OrderPositionDTO orderPositionToOrderPositionDTO(OrderPosition orderPosition) {
        if ( orderPosition == null ) {
            return null;
        }

        OrderPositionDTO orderPositionDTO = new OrderPositionDTO();

        orderPositionDTO.setId( orderPosition.getId() );
        if ( orderPosition.getAmount() != null ) {
            orderPositionDTO.setAmount( orderPosition.getAmount().longValue() );
        }
        orderPositionDTO.setTea( teaToTeaDTO( orderPosition.getTea() ) );

        return orderPositionDTO;
    }

    protected Set<OrderPositionDTO> orderPositionSetToOrderPositionDTOSet(Set<OrderPosition> set) {
        if ( set == null ) {
            return null;
        }

        Set<OrderPositionDTO> set1 = new LinkedHashSet<OrderPositionDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( OrderPosition orderPosition : set ) {
            set1.add( orderPositionToOrderPositionDTO( orderPosition ) );
        }

        return set1;
    }
}
