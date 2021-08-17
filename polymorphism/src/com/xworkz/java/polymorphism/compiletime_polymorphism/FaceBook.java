package com.xworkz.java.polymorphism.compiletime_polymorphism;

public class FaceBook {
	void search(String name) {
		System.out.println(" searching person "+ name +"on facebook " );
	}
	void search(long contactNumber) {
		System.out.println(" searching through"+ contactNumber +" on facebook" );
	}
	void search(String name, long contactNumber) {
		System.out.println(" searching through both " +contactNumber+name+ "on facebook" );
	}

}
