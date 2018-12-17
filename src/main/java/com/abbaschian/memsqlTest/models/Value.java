/*
 * Copyright (c) 2018. by Babak Joze Abbaschian (babak_abbaschian@yahoo.com, https://www.linkedin.com/in/babakabbaschian/)
 * Any copy, edit or derivation from this code requires written agreement from Babak Joze Abbaschian.
 * 12/17/18 9:47 AM
 */

package com.abbaschian.memsqlTest.models;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "values")
public class Value {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String displayName;
    private String unitsSymbol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getUnitsSymbol() {
        return unitsSymbol;
    }

    public void setUnitsSymbol(String unitsSymbol) {
        this.unitsSymbol = unitsSymbol;
    }
}
