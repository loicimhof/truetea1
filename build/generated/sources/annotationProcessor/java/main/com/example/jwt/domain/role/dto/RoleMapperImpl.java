package com.example.jwt.domain.role.dto;

import com.example.jwt.domain.role.Role;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-09-20T16:22:29+0200",
    comments = "version: 1.5.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.5.jar, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role fromDTO(RoleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( dto.getId() );
        role.setName( dto.getName() );

        return role;
    }

    @Override
    public List<Role> fromDTOs(List<RoleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( dtos.size() );
        for ( RoleDTO roleDTO : dtos ) {
            list.add( fromDTO( roleDTO ) );
        }

        return list;
    }

    @Override
    public Set<Role> fromDTOs(Set<RoleDTO> dtos) {
        if ( dtos == null ) {
            return null;
        }

        Set<Role> set = new LinkedHashSet<Role>( Math.max( (int) ( dtos.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : dtos ) {
            set.add( fromDTO( roleDTO ) );
        }

        return set;
    }

    @Override
    public RoleDTO toDTO(Role BO) {
        if ( BO == null ) {
            return null;
        }

        RoleDTO roleDTO = new RoleDTO();

        roleDTO.setId( BO.getId() );
        roleDTO.setName( BO.getName() );

        return roleDTO;
    }

    @Override
    public List<RoleDTO> toDTOs(List<Role> BOs) {
        if ( BOs == null ) {
            return null;
        }

        List<RoleDTO> list = new ArrayList<RoleDTO>( BOs.size() );
        for ( Role role : BOs ) {
            list.add( toDTO( role ) );
        }

        return list;
    }

    @Override
    public Set<RoleDTO> toDTOs(Set<Role> BOs) {
        if ( BOs == null ) {
            return null;
        }

        Set<RoleDTO> set = new LinkedHashSet<RoleDTO>( Math.max( (int) ( BOs.size() / .75f ) + 1, 16 ) );
        for ( Role role : BOs ) {
            set.add( toDTO( role ) );
        }

        return set;
    }
}
