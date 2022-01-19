package com.example.demo.exception;

public class CreateException extends RuntimeException{
    public CreateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
