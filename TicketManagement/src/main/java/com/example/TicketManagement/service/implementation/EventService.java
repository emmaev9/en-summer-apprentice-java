package com.example.TicketManagement.service.implementation;

import com.example.TicketManagement.exception.EventNotFoundException;
import com.example.TicketManagement.exception.NoEventsFoundException;
import com.example.TicketManagement.model.Customer;
import com.example.TicketManagement.model.Event;
import com.example.TicketManagement.repository.EventRepository;
import com.example.TicketManagement.service.IEventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService implements IEventService {
    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public void saveEvent(Event event) {
        eventRepository.save(event);
    }

    @Override
    public Event findEventById(Integer id){
        return eventRepository.findById(id)
                .orElseThrow(() ->new EventNotFoundException("Event with ID " + id + " not found."));
    }

    @Override
    public List<Event> findAllEvents() {
        List<Event> events = eventRepository.findAll();
        if(events.isEmpty()){
            throw new NoEventsFoundException("No event found");
        }
        return events;
    }

    @Override
    public List<Event> findEventsByVenueIDandEventTypeName(Integer venueID, String eventTypeName) {
        List<Event> events = eventRepository.findAllByVenue_VenueID(venueID);
        List<Event> filteredEvents = events.stream().filter(a -> a.getEventType().getEventTypeName().equals(eventTypeName)).toList();
        if(filteredEvents.isEmpty()){
            throw new NoEventsFoundException("No event found");
        }
        return  filteredEvents;
    }
}
