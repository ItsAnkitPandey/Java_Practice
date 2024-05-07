package com.abc.cservice.exception;

public class CustomerNotFoundException extends RuntimeException {
	 public CustomerNotFoundException() {
	        super();
	    }
	    
	    public CustomerNotFoundException(String msg) {
	        super(msg);
	    }
}
