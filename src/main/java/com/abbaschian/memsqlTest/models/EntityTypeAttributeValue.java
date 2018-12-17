/*
 * Copyright (c) 2018. by Babak Joze Abbaschian (babak_abbaschian@yahoo.com, https://www.linkedin.com/in/babakabbaschian/)
 * Any copy, edit or derivation from this code requires written agreement from Babak Joze Abbaschian.
 * 12/17/18 9:42 AM
 */

package com.abbaschian.memsqlTest.models;

import javax.persistence.*;

@javax.persistence.Entity
@Table(name = "entity_type_attribute_values")
public class EntityTypeAttributeValue {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private EntityType entityType;
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

    public EntityType getEntityType() {
        return entityType;
    }

    public void setEntityType(EntityType entityType) {
        this.entityType = entityType;
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
