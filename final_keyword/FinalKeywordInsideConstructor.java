package com.xworkz.java.final_keyword;

public class FinalKeywordInsideConstructor {
	public static void main(String args[]) {
		Person priyanka = new Person();
		System.out.println(priyanka.NAME);
		Person yeesha = new Person(24);
		System.out.println(yeesha.NAME);
	}

}
