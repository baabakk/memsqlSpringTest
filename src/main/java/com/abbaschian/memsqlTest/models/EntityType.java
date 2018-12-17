package com.abbaschian.memsqlTest.models;

import javax.persistence.*;
import javax.persistence.Entity;

@Entity
@Table(name="entity_types")
public class EntityType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Boolean isAbstract;
    private Boolean isPhysical;
    @ManyToOne
    private EntityType parentEntityType;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAbstract() {
        return isAbstract;
    }

    public void setAbstract(Boolean anAbstract) {
        isAbstract = anAbstract;
    }

    public Boolean getPhysical() {
        return isPhysical;
    }

    public void setPhysical(Boolean physical) {
        isPhysical = physical;
    }

    public EntityType getParentEntityType() {
        return parentEntityType;
    }

    public void setParentEntityType(EntityType parentEntityType) {
        this.parentEntityType = parentEntityType;
    }
}
