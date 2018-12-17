/*
 * Copyright (c) 2018. by Babak Joze Abbaschian (babak_abbaschian@yahoo.com, https://www.linkedin.com/in/babakabbaschian/)
 * Any copy, edit or derivation from this code requires written agreement from Babak Joze Abbaschian.
 * 12/17/18 9:53 AM
 */

package com.abbaschian.memsqlTest.models;


import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "entity_attribute_value")
public class EntityAttributeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Entity entity;
    @ManyToOne
    private Attribute attribute;
    @ManyToOne
    private Value value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Entity getEntityType() {
        return entity;
    }

    public void setEntityType(Entity entity) {
        this.entity = entity;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
