package com.example.test.Exceptions;
import java.util.Objects;

public class GlobalError {
    
    private Integer errorCode;
    private String message;

    public GlobalError(Integer errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public Integer geterrorCode() {
        return this.errorCode;
    }

    public void seterrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
  
    
}
