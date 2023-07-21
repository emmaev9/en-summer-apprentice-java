package com.example.TicketManagement.service.implementation;

import com.example.TicketManagement.repository.VenueRepository;
import com.example.TicketManagement.service.IVenueService;
import org.springframework.stereotype.Service;

@Service
public class VenueService implements IVenueService {
    private final VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }
}
