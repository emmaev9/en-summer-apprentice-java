package com.example.TicketManagement.controller;

import com.example.TicketManagement.service.implementation.EventTypeService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EveneTypeController {

    private final EventTypeService eventTypeService;

    public EveneTypeController(EventTypeService eventTypeService) {
        this.eventTypeService = eventTypeService;
    }
}
