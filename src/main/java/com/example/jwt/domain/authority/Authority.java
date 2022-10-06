package com.example.jwt.domain.authority;

import com.example.jwt.core.generic.ExtendedEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "authority")
public class Authority extends ExtendedEntity {

    @Column(name = "name", nullable = false, unique = true)
    private String name;

/*    @ManyToMany(mappedBy = "authorities")
    Set<Role> roles = new HashSet<>();*/

    public Authority() {
    }

    public Authority(UUID id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
