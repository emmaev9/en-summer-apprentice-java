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

@Table(name="venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer venueID;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name="type", nullable = false)
    private String type;

    @Column(name="capacity", nullable = false)
    private Integer capacity;
}
