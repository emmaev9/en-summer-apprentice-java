package com.example.TicketManagement.service.implementation;

import com.example.TicketManagement.dto.OrderDTO;
import com.example.TicketManagement.exception.CustomerNotFoundException;
import com.example.TicketManagement.exception.InvalidFieldException;
import com.example.TicketManagement.exception.NoOrdersFoundException;
import com.example.TicketManagement.model.Customer;
import com.example.TicketManagement.model.Order;
import com.example.TicketManagement.model.TicketCategory;
import com.example.TicketManagement.repository.CustomerRepository;
import com.example.TicketManagement.repository.OrderRepository;
import com.example.TicketManagement.repository.TicketCategoryRepository;
import com.example.TicketManagement.service.IOrderService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@Service
public class OrderService implements IOrderService {
    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final TicketCategoryRepository ticketCategoryRepository;

    public OrderService(OrderRepository orderRepository, CustomerRepository customerRepository, TicketCategoryRepository ticketCategoryRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.ticketCategoryRepository = ticketCategoryRepository;
    }

    @Override
    public void saveOrder(OrderDTO orderDTO, Integer customerID) {

        Customer currentCustomer = customerRepository.findById(customerID)
                .orElseThrow(() ->new CustomerNotFoundException("Customer with ID " + customerID + " not found."));

        Order newOrder = new Order();
        newOrder.setCustomer(currentCustomer);
        newOrder.setNumberOfTickets(orderDTO.getNumberOfTickets());

        ZoneId defaultZoneId = ZoneId.systemDefault();
        LocalDate now = LocalDate.now();
        Date date = Date.from(now.atStartOfDay(defaultZoneId).toInstant());
        newOrder.setOrderAt(date);

        TicketCategory ticketCategory = ticketCategoryRepository.findByTicketCategoryIDAndEvent_EventID(orderDTO.getTicketCategoryID(),orderDTO.getEventID());

        if(ticketCategory == null){
            throw new InvalidFieldException("eventID or ticketCategoryID does not exist");
        }
        if(orderDTO.getNumberOfTickets() <= 0){
            throw new InvalidFieldException("Number of tickets must be greater than zero.");
        }

        float totalPrice = ticketCategory.getPrice() * orderDTO.getNumberOfTickets();
        newOrder.setTotalPrice(totalPrice);
        newOrder.setTicketCategory(ticketCategory);

        orderRepository.save(newOrder);
    }

    @Override
    public List<Order> getOrdersByCustomerID(Integer customerID) {
        List<Order> order = orderRepository.findAllByCustomer_CustomerID(customerID);
        if(order.isEmpty()){
            throw new NoOrdersFoundException("No orders found for customer with ID: "+ customerID);
        }
        return order;
    }
}
