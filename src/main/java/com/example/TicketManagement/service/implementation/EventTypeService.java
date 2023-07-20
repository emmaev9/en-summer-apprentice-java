package com.example.TicketManagement.service.implementation;

import com.example.TicketManagement.repository.EventRepository;
import com.example.TicketManagement.service.IEventTypeService;
import org.springframework.stereotype.Service;

@Service
public class EventTypeService implements IEventTypeService {
    private final EventRepository eventRepository;

    public EventTypeService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }
}
