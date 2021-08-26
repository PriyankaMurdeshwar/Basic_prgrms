package com.xworkz.java.final_keyword;

public class Person {
	final String NAME;// it gives error because it is not initialized.
	
	Person(){
		NAME = "PRIYANKA";//error gone
	
	}
	Person(int age){
		NAME = "YEESHA";
		
	}

}
//OUTPUT
//PRIYANKA
//YEESHA

