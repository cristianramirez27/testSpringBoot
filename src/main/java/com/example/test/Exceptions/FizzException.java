package com.example.test.Exceptions;

// --- 1. Custom Exceptions ---
public class FizzException extends RuntimeException {
    public FizzException(String message) {
        super(message);
    }
}