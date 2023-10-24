package com.example.comiccompanionbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Custom exception class for indicating that requested information is not found.
 *
 * This exception should be thrown when a specific piece of information, such as a resource or record,
 * is not found in the system or database. It is typically used in situations where a client has
 * requested data that does not exist.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class InformationNotFoundException extends RuntimeException{
    /**
     * Constructs a new InformationNotFoundException with the specified detail message.
     *
     * @param message The detail message describing why the information was not found.
     */
    public InformationNotFoundException(String message) { super(message);}
}
