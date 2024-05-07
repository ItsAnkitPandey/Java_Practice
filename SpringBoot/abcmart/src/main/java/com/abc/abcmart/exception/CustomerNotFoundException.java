package com.abc.abcmart.exception;

public class CustomerNotFoundException extends RuntimeException {
	 public CustomerNotFoundException() {
	        super();
	    }
	    
	    public CustomerNotFoundException(String msg) {
	        super(msg);
	    }
}
