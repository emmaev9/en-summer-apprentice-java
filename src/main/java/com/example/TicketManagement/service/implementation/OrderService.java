package com.example.TicketManagement.service.implementation;

import com.example.TicketManagement.repository.OrderRepository;
import com.example.TicketManagement.service.IOrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
}
