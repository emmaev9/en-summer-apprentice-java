package com.example.TicketManagement.exception.handler;

import com.example.TicketManagement.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(value = InvalidFieldException.class)
    public ResponseEntity<?> handleInvalidFieldException(InvalidFieldException exception){
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body("Invalid field: " + exception.getMessage());
    }

    @ExceptionHandler(value = EventNotFoundException.class)
    public ResponseEntity<?> handleEventNotFoundException(EventNotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(value = CustomerNotFoundException.class)
    public ResponseEntity<?> handleCustomerNotFoundException(CustomerNotFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(value = NoEventsFoundException.class)
    public ResponseEntity<?> handleNoEventsFoundException(NoEventsFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(value = NoOrdersFoundException.class)
    public ResponseEntity<?> handleNoOrdersFoundException(NoOrdersFoundException exception){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        // Handle other exceptions and return an appropriate response
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("An error occurred: " + ex.getMessage());
    }


}
