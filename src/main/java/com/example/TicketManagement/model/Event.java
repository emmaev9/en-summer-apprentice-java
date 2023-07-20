
package com.example.TicketManagement.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

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

    @Column(name="eventDescription")
    private String eventDescription;

    @Column(name="eventName",nullable = false)
    private String eventName;

    @Column(name="startDate", nullable = false)
    private Date startDate;

    @Column(name="endDate", nullable = false)
    private Date endDate;
}

