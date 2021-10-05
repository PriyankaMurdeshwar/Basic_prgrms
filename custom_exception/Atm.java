package com.xworkz.java.exception.custom_exception;

public class Atm {
			void draw(int amount) throws AtmExp{
				if(amount > 50000 || amount%100 == 0) {
					AtmExp atmExp = new AtmExp();
					throw atmExp;
				}
				else {
					System.out.println(amount + "amount withdrawn, collect it");
				}
			}
	

}
