package com.example.jwt.domain.rank;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "rank")
public class Rank extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "required_seeds")
    private Long requiredSeeds;

    @Column(name = "discount")
    private Long discount;


    public Rank() {
    }

    public Rank(UUID id, String name, Long requiredSeeds, Long discount) {
        super(id);
        this.name = name;
        this.requiredSeeds = requiredSeeds;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public Rank setName(String name) {
        this.name = name;
        return this;
    }

    public Long getRequiredSeeds() {
        return requiredSeeds;
    }

    public Rank setRequiredSeeds(Long requiredSeeds) {
        this.requiredSeeds = requiredSeeds;
        return this;
    }

    public Long getDiscount() {
        return discount;
    }

    public Rank setDiscount(Long discount) {
        this.discount = discount;
        return this;
    }
}
