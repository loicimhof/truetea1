package com.example.jwt.domain.rank.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import javax.persistence.Column;
import java.util.Date;
import java.util.UUID;

public class RankDTO extends ExtendedDTO{

    private String name;

    private Integer requiredSeeds;

    private Long discount;


    public RankDTO() {
    }

    public RankDTO(UUID id, String name, Integer requiredSeeds, Long discount) {
        super(id);
        this.name = name;
        this.requiredSeeds = requiredSeeds;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public RankDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getRequiredSeeds() {
        return requiredSeeds;
    }

    public RankDTO setRequiredSeeds(Integer requiredSeeds) {
        this.requiredSeeds = requiredSeeds;
        return this;
    }

    public Long getDiscount() {
        return discount;
    }

    public RankDTO setDiscount(Long discount) {
        this.discount = discount;
        return this;
    }
}
