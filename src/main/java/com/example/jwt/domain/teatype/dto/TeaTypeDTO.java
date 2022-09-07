package com.example.jwt.domain.teatype.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import java.util.UUID;

public class TeaTypeDTO extends ExtendedDTO{

    private String name;


    public TeaTypeDTO() {
    }

    public TeaTypeDTO(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public TeaTypeDTO setName(String name) {
        this.name = name;
        return this;
    }
}
