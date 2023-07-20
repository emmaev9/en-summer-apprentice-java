package com.example.TicketManagement.service.implementation;

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
    public Event findEventById(Integer id) {
        Optional<Event> eventOptional = eventRepository.findById(id);
        if(eventOptional.isPresent()){
            return eventOptional.get();
        }
        return null;
    }

    @Override
    public List<Event> findAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public List<Event> findEventsByVenueIDandEventTypeID(Integer venueID, Integer eventTypeID) {
        return eventRepository.findAllByVenue_VenueIDAndEventType_EventTypeID(venueID, eventTypeID);
    }
}
