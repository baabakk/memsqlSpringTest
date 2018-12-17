/*
 * Copyright (c) 2018. by Babak Joze Abbaschian
 */
package com.abbaschian.memsqlTest.controllers;

import com.abbaschian.memsqlTest.models.Entity;
import com.abbaschian.memsqlTest.repositories.EntityRepository;
import com.abbaschian.memsqlTest.services.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/entity")
public class EntityController {

    @Autowired
    private EntityService entityService;

    public EntityController(EntityService entityService) {
        this.entityService = entityService;
    }

    @GetMapping(path = "/listEntities")
    public @ResponseBody Iterable<Entity> getEntityList(){
        return entityService.getEntityList();
    }

}
