package com.xworkz.java.constructor.constructor_java;

public class Watch {
	String name;
	String color;
	double price;
	
	Watch(String name){
		this.name = name;
		System.out.println(this.name);
		System.out.println("single");
	}
	Watch(){
		System.out.println("-watch");
	}
}
