package com.abbaschian.memsqlTest.repositories;

import com.abbaschian.memsqlTest.models.Entity;
import org.springframework.data.repository.CrudRepository;

public interface EntityRepository  extends CrudRepository<Entity, Integer> {
}
