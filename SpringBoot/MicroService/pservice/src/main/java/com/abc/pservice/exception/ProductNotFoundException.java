package com.abc.pservice.exception;

public class ProductNotFoundException extends RuntimeException {
    
    public ProductNotFoundException() {
        super();
    }
    
    public ProductNotFoundException(String msg) {
        super(msg);
    }
}