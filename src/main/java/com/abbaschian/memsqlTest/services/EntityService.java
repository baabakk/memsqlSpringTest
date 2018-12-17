package com.abbaschian.memsqlTest.services;

import com.abbaschian.memsqlTest.models.Entity;
import com.abbaschian.memsqlTest.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntityService {
    @Autowired
    private EntityRepository entityRepository;

    public EntityService(EntityRepository entityRepository) {
        this.entityRepository = entityRepository;
    }

    public Iterable<Entity> getEntityList() {
        return entityRepository.findAll();
    }
}
