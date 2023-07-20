package com.example.TicketManagement.service;

import com.example.TicketManagement.model.Customer;

import java.util.List;

public interface ICustomerService {
    void saveCustomer(Customer customer);
    Customer findCustomerById(Integer id);
    List<Customer> findAllCustomers();

}
