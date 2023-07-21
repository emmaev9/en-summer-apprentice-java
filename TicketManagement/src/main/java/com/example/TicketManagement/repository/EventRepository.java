package com.example.TicketManagement.repository;

import com.example.TicketManagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    List<Event> findAllByVenue_VenueIDAndEventType_EventTypeName(Integer venueId, String eventTypeName);
    List<Event> findAllByVenue_VenueID(Integer id);
}
