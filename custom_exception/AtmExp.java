package com.xworkz.java.exception.custom_exception;

public class AtmExp extends Exception{

	@Override
	public String toString() {
		return "the amount you entered exceeding the limit";
	}
	public String getMessage() {
		return "Invalid amount";
		
	}
	public String message() {
		return "you have low balance";
	}
	
	
}
