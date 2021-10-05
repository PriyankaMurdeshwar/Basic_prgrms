package com.xworkz.java.exception.custom_exception.unchecked_exception;

public class WhatsAppException extends Exception {
	
	@Override
	public String toString() {
		return "WhatsAppException []";
	}

	public String getMessage() {
		return " cannot upload more than 1 GB";
	}

}
