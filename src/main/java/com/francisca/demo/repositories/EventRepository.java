package com.francisca.demo.repositories;

import com.francisca.demo.controller.model.MyEvents;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends MongoRepository<MyEvents, String > {


}
