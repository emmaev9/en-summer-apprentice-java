package com.example.TicketManagement.service;

import com.example.TicketManagement.dto.OrderDTO;
import com.example.TicketManagement.model.Order;

public interface IOrderService {
    void saveOrder(OrderDTO orderDTO, Integer customerID);
    Order getOrder(Integer orderID);
}
