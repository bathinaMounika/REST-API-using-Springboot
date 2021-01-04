package com.example.December.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Countries {
    
    private Long id;
    @Column(unique = true)
    private String name;
    private String capital;
    private Integer statesCount;

    @Id
    @GeneratedValue
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Integer getStatesCount() {
        return this.statesCount;
    }

    public void setStatesCount(Integer statesCount) {
        this.statesCount = statesCount;
    }

}
