package com.example.TicketManagement.controller;

import com.example.TicketManagement.dto.OrderDTO;
import com.example.TicketManagement.model.Order;
import com.example.TicketManagement.service.implementation.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("api/order/{id}")
    public ResponseEntity<?> getOrder(@PathVariable Integer id){
        return ResponseEntity.ok(orderService.getOrder(id));
    }


    @PostMapping("/api/order")
    public ResponseEntity<?> saveOrder(@RequestBody OrderDTO orderDTO){
        Integer customerID = 1;
        orderService.saveOrder(orderDTO, customerID);
        return ResponseEntity.ok("Order saved");
    }

}
