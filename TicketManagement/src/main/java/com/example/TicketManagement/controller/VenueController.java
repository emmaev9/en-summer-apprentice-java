package com.example.TicketManagement.controller;

import com.example.TicketManagement.service.implementation.VenueService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VenueController {
    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }
}
