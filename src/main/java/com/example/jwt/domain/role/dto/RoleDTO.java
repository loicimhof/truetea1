package com.example.jwt.domain.role.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

public class RoleDTO extends ExtendedDTO {

    @NotNull
    @Size(min = 1, max = 255)
    private String name;

/*    @Valid
    private Set<AuthorityDTO> authorities;*/

    public RoleDTO() {
    }

    public RoleDTO(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}