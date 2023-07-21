package com.example.TicketManagement.repository;

import com.example.TicketManagement.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepository extends JpaRepository<Venue, Integer>{

}
