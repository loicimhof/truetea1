package com.example.jwt.domain.country;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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
