package com.xworkz.java.constructor.constructor_java;

public class SmartWatch extends Watch {

	String type;
	String model;
	
	SmartWatch(){
		super("Titan");
		System.out.println("two");
	}
	
	SmartWatch(String color){
		super();
		System.out.println("vivo");
	}
}
