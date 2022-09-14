package com.example.jwt.domain.country;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.tea.Tea;
import com.example.jwt.domain.user.User;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "country")
public class Country extends ExtendedEntity {

    @Column(name = "name")
    private String name;


    public Country() {
    }

    public Country(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }
}
