package com.xworkz.java.constructor.constructor_java;

public class Flight {
	String name;
	String number;
	int capacity;
	String source;
	String destination;
	
	Flight(){
		name = "indigo";//actually we are define any value like this.
		number = "S550";
		capacity = 900;
		source = "Hubli";
		destination = "Goa";
		
	}
	
	Flight(String name,String number, int capacity, String source, String destination){
		this.name = name;
		this.number = number;
		this.capacity = capacity;
		this. source = source;
		this.destination = destination;
		
	}

}
