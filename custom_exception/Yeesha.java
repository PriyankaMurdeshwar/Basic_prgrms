package com.xworkz.java.exception.custom_exception;

import java.util.Scanner;

public class Yeesha {


	public static void main(String args[]) {
		//int money = 10000;
		//Scanner sc = new Scanner(System.in);
			//	System.out.println("withdraw ammount :");
		
	//	int withdraw = sc.nextInt();
		//int remain = money - withdraw;
		//System.out.println("Remaining balance :" + remain);
		
		ExceptionTest obj = new ExceptionTest();
		try {
			obj.atm(10000);
		}
		catch(LowBalanceException e ){
			System.out.println(e);
			
		}
		
	}
}
