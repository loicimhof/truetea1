package com.example.jwt.domain.user.dto;

import com.example.jwt.core.generic.ExtendedDTO;
import com.example.jwt.domain.role.dto.RoleDTO;

import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Set;
import java.util.UUID;

public class UserDTO extends ExtendedDTO {

    private String firstName;

    private String lastName;

    @Email
    private String email;
    @Valid
    private Set<RoleDTO> roles;

    @NotNull
    @Min(value = 0)
    private Integer seeds;

    public UserDTO() {
    }

    public UserDTO(UUID id, String firstName, String lastName, String email, Set<RoleDTO> roles, Integer seeds) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.roles = roles;
        this.seeds = seeds;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public UserDTO setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
        return this;
    }

    public Integer getSeeds() {
        return seeds;
    }

    public UserDTO setSeeds(Integer seeds) {
        this.seeds = seeds;
        return this;
    }
}
