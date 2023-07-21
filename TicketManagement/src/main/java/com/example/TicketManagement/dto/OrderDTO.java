package com.example.TicketManagement.dto;

import com.example.TicketManagement.model.Customer;
import com.example.TicketManagement.model.TicketCategory;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {
    private Integer eventID;
    private Integer ticketCategoryID;
    private int numberOfTickets;
}
