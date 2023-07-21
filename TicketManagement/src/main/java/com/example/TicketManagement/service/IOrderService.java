package com.example.TicketManagement.service;

import com.example.TicketManagement.dto.OrderDTO;
import com.example.TicketManagement.model.Order;

import java.util.List;

public interface IOrderService {
    void saveOrder(OrderDTO orderDTO, Integer customerID);
    List<Order> getOrdersByCustomerID(Integer orderID);
}
