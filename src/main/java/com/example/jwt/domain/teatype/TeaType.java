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

    @Column(name = "req_age", nullable = false)
    private Integer reqAge;

    @Column(name = "req_rank_weight", nullable = false)
    private Integer reqRankWeight;

    @OneToMany
    @JoinColumn(name = "tea_id", referencedColumnName = "id")
    private List<Tea> tea;

    public TeaType() {
    }

    public TeaType(UUID id, String name, Integer reqAge, Integer reqRankWeight, List<Tea> tea) {
        super(id);
        this.name = name;
        this.reqAge = reqAge;
        this.reqRankWeight = reqRankWeight;
        this.tea = tea;
    }

    public String getName() {
        return name;
    }

    public TeaType setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getReqAge() {
        return reqAge;
    }

    public TeaType setReqAge(Integer reqAge) {
        this.reqAge = reqAge;
        return this;
    }

    public Integer getReqRankWeight() {
        return reqRankWeight;
    }

    public TeaType setReqRankWeight(Integer reqRankWeight) {
        this.reqRankWeight = reqRankWeight;
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
