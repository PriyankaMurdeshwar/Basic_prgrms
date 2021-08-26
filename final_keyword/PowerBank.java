package com.xworkz.java.final_keyword;

public class PowerBank {
	final static String FULLY_CHARGED = "yes";
	final int CAPACITY = 2000;//in line
	 //copyCapacity++; it gives error
	
	void finalDemo() {
		int copyCapacity = CAPACITY;
		copyCapacity++;
		System.out.println(copyCapacity);
	}
	void finalDemo1() {
		final int X;//compiler wont assign default value, so we can initialize value in the next line.
		X = 3000;
		System.out.println(X);
		//X++; we cant modify final variable.
		
	}
}



//OUTPUT:
//2000
//2001
//3000
//yes