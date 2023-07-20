package com.example.TicketManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer orderID;

    @ManyToOne
    @JoinColumn(name="customerID")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name="ticketCategoryID")
    private TicketCategory ticketCategory;

    @Column(name="orderAt", nullable = false)
    private Date orderAt;

    @Column(name="numberOfTickets", nullable = false)
    private int numberOfTickets;

    @Column(name="totalPrice", nullable = false)
    private float totalPrice;
}
