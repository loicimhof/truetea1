package com.example.jwt.domain.order;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Order extends ExtendedEntity {

    @Column(name = "date_bought")
    private Date date_bought;

    @Column(name = "reduction")
    private Long reduction;

    @Column(name = "discount")
    private Long final_price;

    public Order() {
    }

    public Date getDate_bought() {
        return date_bought;
    }

    public Order setDate_bought(Date date_bought) {
        this.date_bought = date_bought;
        return this;
    }

    public Long getReduction() {
        return reduction;
    }

    public Order setReduction(Long reduction) {
        this.reduction = reduction;
        return this;
    }

    public Long getFinal_price() {
        return final_price;
    }

    public Order setFinal_price(Long final_price) {
        this.final_price = final_price;
        return this;
    }
}
