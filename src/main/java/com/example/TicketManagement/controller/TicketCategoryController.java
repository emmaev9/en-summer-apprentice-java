package com.example.TicketManagement.controller;

import com.example.TicketManagement.service.implementation.TicketCategoryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketCategoryController {

    private final TicketCategoryService ticketCategoryService;

    public TicketCategoryController(TicketCategoryService ticketCategoryService) {
        this.ticketCategoryService = ticketCategoryService;
    }
}
