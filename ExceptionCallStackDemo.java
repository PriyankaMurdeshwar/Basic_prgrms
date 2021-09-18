package com.xworkz.java.exception.compile_time_exception.call_stack;

public class ExceptionCallStackDemo {
	
	
	static int divide(int a, int b) {
		return a/b;
	}
	
	static int computeDivision(int a, int b) {
		return divide(a,b);
	}
	
	public static void main(String args[]) {
		
		System.out.println("main stareted");
		System.out.println(computeDivision(10,0));
	}
}
