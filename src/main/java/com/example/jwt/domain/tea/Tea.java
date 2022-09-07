package com.example.jwt.domain.tea;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "tea")
public class Tea extends ExtendedEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String Description;

    @Column(name = "origin")
    private String origin;

    @Column(name = "buying_price")
    private Long buyingPrice;

    @Column(name = "selling_price")
    private String sellingPrice;

    @Column(name = "harvest_date")
    private Date harvestDate;


    /*
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "users_role",
            joinColumns = @JoinColumn(name = "users_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<Role> roles = new HashSet<>();

     */

    public Tea() {
    }

    public Tea(UUID id, String name, String description, String origin, Long buyingPrice, String sellingPrice, Date harvestDate) {
        super(id);
        this.name = name;
        Description = description;
        this.origin = origin;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.harvestDate = harvestDate;
    }

    public String getName() {
        return name;
    }

    public Tea setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return Description;
    }

    public Tea setDescription(String description) {
        Description = description;
        return this;
    }

    public String getOrigin() {
        return origin;
    }

    public Tea setOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    public Long getBuyingPrice() {
        return buyingPrice;
    }

    public Tea setBuyingPrice(Long buyingPrice) {
        this.buyingPrice = buyingPrice;
        return this;
    }

    public String getSellingPrice() {
        return sellingPrice;
    }

    public Tea setSellingPrice(String sellingPrice) {
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
}
