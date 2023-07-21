package com.example.TicketManagement.controller;

import com.example.TicketManagement.service.implementation.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/customer/{id}")
    public ResponseEntity<?> getCustomerById(@PathVariable Integer id){

        return ResponseEntity.ok(customerService.findCustomerById(id));
    }
}
