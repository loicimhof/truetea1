package com.example.jwt.domain.user.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import java.util.UUID;

public class LockUserDTO extends ExtendedDTO {

    private boolean locked;


    public LockUserDTO() {
    }

    public LockUserDTO(UUID id, boolean locked) {
        super(id);
        this.locked = locked;
    }

    public boolean isLocked() {
        return locked;
    }

    public LockUserDTO setLocked(boolean locked) {
        this.locked = locked;
        return this;
    }
}
