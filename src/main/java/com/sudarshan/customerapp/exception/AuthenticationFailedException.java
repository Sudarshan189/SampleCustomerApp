package com.sudarshan.customerapp.exception;

public class AuthenticationFailedException extends RuntimeException {

	public AuthenticationFailedException(String message) {
		super(message);
	}

}
