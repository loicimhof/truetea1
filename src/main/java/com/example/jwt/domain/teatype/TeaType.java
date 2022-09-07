package com.example.jwt.domain.teatype;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "tea_type")
public class TeaType extends ExtendedEntity {

    @Column(name = "name")
    private String name;


    public TeaType() {
    }

    public TeaType(UUID id, String name) {
        super(id);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public TeaType setName(String name) {
        this.name = name;
        return this;
    }
}
