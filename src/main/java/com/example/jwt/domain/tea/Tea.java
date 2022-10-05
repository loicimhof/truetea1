package com.example.jwt.domain.tea;

import com.example.jwt.core.generic.ExtendedEntity;
import com.example.jwt.domain.country.Country;
import com.example.jwt.domain.teatype.TeaType;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tea")
public class Tea extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "buying_price")
    private Float buyingPrice;

    @Column(name = "selling_price", nullable = false)
    private Float sellingPrice;

    @Column(name = "harvest_date")
    private Date harvestDate;

    @Column(name = "stock")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "origin", referencedColumnName = "id")
    private Country country;


    @ManyToOne
    @JoinColumn(name = "tea_type_id", referencedColumnName = "id")
    private TeaType teaType;

    public Tea() {
    }

    public Tea(UUID id, String name, String description, Float buyingPrice, Float sellingPrice, Date harvestDate, Integer stock, Country country, TeaType teaType) {
        super(id);
        this.name = name;
        this.description = description;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.harvestDate = harvestDate;
        this.stock = stock;
        this.country = country;
        this.teaType = teaType;
    }

    public String getName() {
        return name;
    }

    public Tea setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Tea setDescription(String description) {
        this.description = description;
        return this;
    }

    public Float getBuyingPrice() {
        return buyingPrice;
    }

    public Tea setBuyingPrice(Float buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    public Float getSellingPrice() {
        return sellingPrice;
    }

    public Tea setSellingPrice(Float sellingPrice) {
        this.sellingPrice = sellingPrice;
        return this;
    }

    public Date getHarvestDate() {
        return harvestDate;
    }

    public Tea setHarvestDate(Date harvestDate) {
        this.harvestDate = harvestDate;
        return this;
    }

    public Integer getStock() {
        return stock;
    }

    public Tea setStock(Integer stock) {
        this.stock = stock;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public Tea setCountry(Country country) {
        this.country = country;
        return this;
    }

    public TeaType getTeaType() {
        return teaType;
    }

    public Tea setTeaType(TeaType teaType) {
        this.teaType = teaType;
        return this;
    }
}
