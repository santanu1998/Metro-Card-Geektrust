package com.example.geektrust.exception;
/**
 * @author Santanu Singha
 * @date 27/02/2023
 */

public class ProcessingException extends RuntimeException {
    public ProcessingException() {
        super();
    }

    public ProcessingException(String message) {
        super(message);
    }
}