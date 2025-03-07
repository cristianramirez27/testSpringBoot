package com.example.test.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Exceptions.BuzzException;
import com.example.test.Exceptions.FizzBuzzException;
import com.example.test.Exceptions.FizzException;
import com.example.test.models.FizzBuzzResponse;

@RestController
public class FizzBuzzController {
    


    @GetMapping("/controller_advice/{code}")
     public FizzBuzzResponse handleCode(@PathVariable String code) {
        if (code.equals("fizz")) {
            throw new FizzException("Fizz Exception");
        } else if (code.equals("buzz")) {
            throw new BuzzException("Buzz Exception");
        } else if (code.equals("fizzbuzz")) {
            throw new FizzBuzzException("FizzBuzz Exception");
        } else {
            return new FizzBuzzResponse(200,"Success");
        }
     }
}
