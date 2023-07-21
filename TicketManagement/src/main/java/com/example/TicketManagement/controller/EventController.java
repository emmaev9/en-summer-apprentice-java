package com.example.TicketManagement.controller;

import com.example.TicketManagement.model.Event;
import com.example.TicketManagement.service.implementation.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {
    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/api/event/{id}")
    public String getEventById(@PathVariable Integer id){
        Event event = eventService.findEventById(id);
        return event.toString();
    }

    @GetMapping("/api/events/{venueID}/{eventTypeName}")
    public ResponseEntity<?> getEventsByVenueIdandEventTypeId(@PathVariable("venueID") Integer venueID,
                                                           @PathVariable("eventTypeName") String eventTypeName){
        List<Event> event = eventService.findEventsByVenueIDandEventTypeName(venueID, eventTypeName);
        return ResponseEntity.ok(event);
    }
}
