package com.example.test.models;

import lombok.Data;

@Data
public class FizzBuzzResponse {
    private Integer code;
    private String response;

    public FizzBuzzResponse(Integer code, String response) {
        this.response = response;
        this.code = code;
    }
    
}
