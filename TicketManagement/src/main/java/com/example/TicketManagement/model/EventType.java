package com.example.TicketManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="eventType")
public class EventType {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer eventTypeID;

    @Column(name="name", nullable = false)
    private String eventTypeName;

}
