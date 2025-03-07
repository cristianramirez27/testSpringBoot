package com.example.test.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class FizzBuzzExceptionHandler {


    @ExceptionHandler(FizzException.class)
    public ResponseEntity<GlobalError> handleFizzException(FizzException ex) {
        //GlobalError error = new GlobalError("Fizz Error", ex.getMessage());
        GlobalError error = new GlobalError(500, ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR); // 500
    }
    
    @ExceptionHandler(BuzzException.class)
    public ResponseEntity<GlobalError> handleBuzzException(BuzzException ex) {
        //GlobalError error = new GlobalError("Buzz Error", ex.getMessage());
        GlobalError error = new GlobalError(400, ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST); // 400
    } 
    
    @ExceptionHandler(FizzBuzzException.class)
    public ResponseEntity<GlobalError> handleFizzBuzzException(FizzBuzzException ex) {
        //GlobalError error = new GlobalError("FizzBuzz Error", ex.getMessage());
        GlobalError error = new GlobalError(507, ex.getMessage());
        return new ResponseEntity<>(error, HttpStatus.INSUFFICIENT_STORAGE); // 507
    }

}
