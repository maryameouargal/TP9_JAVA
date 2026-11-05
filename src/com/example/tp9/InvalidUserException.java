package com.example.tp9;

public class InvalidUserException  extends Exception {
	
// the consturtor using source 
	public InvalidUserException(String message) {
		super(message);
	}
	// the consturtor using source 
	public InvalidUserException(String message, Throwable cause) {
		super(message, cause);
	}

}
