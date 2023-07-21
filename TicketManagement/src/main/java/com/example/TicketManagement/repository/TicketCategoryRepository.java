package com.example.TicketManagement.repository;

import com.example.TicketManagement.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketCategoryRepository extends JpaRepository<TicketCategory, Integer> {
    TicketCategory findByTicketCategoryIDAndEvent_EventID(Integer ticketCategoryID, Integer eventID);
}
