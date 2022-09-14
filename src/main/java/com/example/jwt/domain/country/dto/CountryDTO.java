package com.example.jwt.domain.country.dto;

import com.example.jwt.core.generic.ExtendedDTO;

import java.util.Date;
import java.util.UUID;

public class CountryDTO extends ExtendedDTO{

    private Date date_bought;

    private Long reduction;

    private Long final_price;

    public CountryDTO() {
    }

    public CountryDTO(UUID id, Date date_bought, Long reduction, Long final_price) {
        super(id);
        this.date_bought = date_bought;
        this.reduction = reduction;
        this.final_price = final_price;
    }

    public Date getDate_bought() {
        return date_bought;
    }

    public CountryDTO setDate_bought(Date date_bought) {
        this.date_bought = date_bought;
        return this;
    }

    public Long getReduction() {
        return reduction;
    }

    public CountryDTO setReduction(Long reduction) {
        this.reduction = reduction;
        return this;
    }

    public Long getFinal_price() {
        return final_price;
    }

    public CountryDTO setFinal_price(Long final_price) {
        this.final_price = final_price;
        return this;
    }
}