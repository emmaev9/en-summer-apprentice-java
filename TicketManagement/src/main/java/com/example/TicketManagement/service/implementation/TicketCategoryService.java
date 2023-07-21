package com.example.TicketManagement.service.implementation;

import com.example.TicketManagement.repository.TicketCategoryRepository;
import com.example.TicketManagement.service.ITicketCategoryService;
import org.springframework.stereotype.Service;

@Service
public class TicketCategoryService implements ITicketCategoryService {
    private final TicketCategoryRepository ticketCategoryRepository;

    public TicketCategoryService(TicketCategoryRepository ticketCategoryRepository) {
        this.ticketCategoryRepository = ticketCategoryRepository;
    }
}
