package com.xworkz.java.exception.custom_exception;

import java.util.Scanner;

public class ExceptionTest {
	public void atm(int m) throws LowBalanceException{
		int money = m;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter withdraw ammount: ");
		int withdraw = sc.nextInt();
		if(money < withdraw) {
			throw new LowBalanceException();
		}
		else {
			int remain = money - withdraw;
			
			System.out.println("remaining balance: " + remain);
		}
		
	}

}
