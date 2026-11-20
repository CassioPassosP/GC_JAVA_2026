package com.example.demo.exceptions;

public class SoldierNotFoundException extends RuntimeException {
    public SoldierNotFoundException(String message) {
        super(message);
    }
}
