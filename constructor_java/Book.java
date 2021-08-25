package com.xworkz.java.constructor.constructor_java;

public class Book {
	String name;
	int noOfPages;
	
	Book(){
		this("classmate");
		System.out.println("default");
}
	Book(String name, int noOfPages){
		this.name = name;
		this.noOfPages = noOfPages;
		System.out.println("Two");

	}
	Book(String name){
		this(name,200);
		System.out.println("Single");
	}
	
	public static void main(String args[]) {
		Book classmate = new Book();
		
		Book vinay = new Book("vinay");
		
		Book sulekha = new Book("sulekha",200);
	}
}
