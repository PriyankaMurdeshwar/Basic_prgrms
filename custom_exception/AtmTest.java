package com.xworkz.java.exception.custom_exception;

public class AtmTest {
	public static void main(String args[]) {
		Atm atm = new Atm();
		
		//atm.draw(60000); here it gives compile time error handle with try catch
		int amount = 00000;
		try {
			atm.draw(amount);
		} catch (AtmExp e) {
			
			
			if(amount > 00000) {
				System.out.println(e);
			}
			else {
				System.out.println("invalid amount");
			}
			
		}
		
	}
}
