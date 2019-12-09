package com.francisca.demo.controller;

import com.francisca.demo.controller.model.MyEvents;
import com.francisca.demo.repositories.EventRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "events")
public class EventController {

    private final Logger LOG = (Logger) LoggerFactory.getLogger(getClass());

    @Autowired
    private EventRepository eventRepository;

    @GetMapping()
    public MyEventResponse<Object> getAllEvents(){
        LOG.info("Getting all events");
        List<MyEvents> allEvents = eventRepository.findAll();
        return new MyEventResponse<Object>(HttpStatus.OK, "message retrived successfully", allEvents);
    }

//    @PostMapping()
//    public MyEventResponse<MyEvents> addEvent(@RequestBody MyEvents anEvent){
//
//
//    }

}
