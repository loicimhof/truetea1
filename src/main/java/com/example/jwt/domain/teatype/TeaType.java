package com.example.jwt.domain.teatype;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.rank.Rank;
import com.example.jwt.domain.tea.Tea;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tea_type")
public class TeaType extends ExtendedEntity {

    @Column(name = "name")
    private String name;


    @OneToMany
    @JoinColumn(name = "tea_id", referencedColumnName = "id")
    private List<Tea> tea;

    public TeaType() {
    }

    public TeaType(UUID id, String name, List<Tea> tea) {
        super(id);
        this.name = name;
        this.tea = tea;
    }

    public String getName() {
        return name;
    }

    public TeaType setName(String name) {
        this.name = name;
        return this;
    }

    public List<Tea> getTea() {
        return tea;
    }

    public TeaType setTea(List<Tea> tea) {
        this.tea = tea;
        return this;
    }
}
