
package com.example.TicketManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer eventID;

    @ManyToOne
    @JoinColumn(name="venueID")
    private Venue venue;

    @ManyToOne
    @JoinColumn(name="eventTypeID")
    private EventType eventType;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JsonIgnoreProperties("event")
    private List<TicketCategory> ticketCategories = new ArrayList<>();

    @Column(name="eventDescription")
    private String eventDescription;

    @Column(name="eventName",nullable = false)
    private String eventName;

    @Column(name="startDate", nullable = false)
    private Date startDate;

    @Column(name="endDate", nullable = false)
    private Date endDate;
}

