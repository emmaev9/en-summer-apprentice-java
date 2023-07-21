package com.example.TicketManagement.repository;

import com.example.TicketManagement.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    //Customer findByCustomerID(Integer id);
}
