package com.example.jwt.domain.tea.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import java.util.Date;
import java.util.UUID;

public class TeaDTO extends ExtendedDTO {

    private String name;

    private String Description;

    private String origin;

    private String sellingPrice;

    private Date harvestDate;

    public TeaDTO() {
    }

    public TeaDTO(UUID id, String name, String description, String origin, String sellingPrice, Date harvestDate) {
        super(id);
        this.name = name;
        Description = description;
        this.origin = origin;
        this.sellingPrice = sellingPrice;
        this.harvestDate = harvestDate;
    }

    public String getName() {
        return name;
    }

    public TeaDTO setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public TeaDTO setDescription(String description) {
        Description = description;
        return this;
    }

    public String getOrigin() {
        return origin;
    }

    public TeaDTO setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public TeaDTO setSellingPrice(String sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }

    public Date getHarvestDate() {
        return harvestDate;
    }

    public TeaDTO setHarvestDate(Date harvestDate) {
        this.harvestDate = harvestDate;
        return this;
    }
}
