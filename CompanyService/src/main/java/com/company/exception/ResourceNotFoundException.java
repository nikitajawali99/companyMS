package com.company.exception;

public class ResourceNotFoundException extends RuntimeException{

	public ResourceNotFoundException() {
		super("Reasource not found");
	}

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
