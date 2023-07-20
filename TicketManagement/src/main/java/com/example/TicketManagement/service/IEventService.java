package com.example.TicketManagement.service;

import com.example.TicketManagement.model.Event;

import java.util.List;

public interface IEventService {
    void saveEvent(Event event);
    Event findEventById(Integer id);
    List<Event> findAllEvents();
    List<Event> findEventsByVenueIDandEventTypeID(Integer venueID, Integer eventTypeID);
}
