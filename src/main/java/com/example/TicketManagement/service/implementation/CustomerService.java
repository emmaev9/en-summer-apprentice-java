package com.example.TicketManagement.service.implementation;

import com.example.TicketManagement.model.Customer;
import com.example.TicketManagement.repository.CustomerRepository;
import com.example.TicketManagement.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(Integer id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if(customerOptional.isPresent()){
            return customerOptional.get();
        }
        return null;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();


    }
}
