package com.example.TicketManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Table(name="ticketCategory")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer ticketCategoryID;

    @ManyToOne
    @JoinColumn(name="eventID")
    private Event event;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="price", nullable = false)
    private float price;
}
