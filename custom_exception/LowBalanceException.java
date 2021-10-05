package com.xworkz.java.exception.custom_exception;

public class LowBalanceException extends Exception{
	
	public LowBalanceException() {
		super("insufficient balance");
	}

}
