package com.example.TicketManagement.exception;

public class NoEventsFoundException extends RuntimeException{
    public NoEventsFoundException(String message){
        super(message);
    }
}
