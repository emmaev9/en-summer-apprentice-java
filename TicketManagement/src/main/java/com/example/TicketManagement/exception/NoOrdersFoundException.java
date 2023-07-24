package com.example.TicketManagement.exception;

public class NoOrdersFoundException extends RuntimeException{
    public NoOrdersFoundException(String message){
        super(message);
    }
}
