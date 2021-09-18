package com.xworkz.java.wrapper_classes.boxing;

public class BoxingDemo {
	public static void main(String args[]) {
		//int a = 10;
		
		//Integer a = 10;
		
		//Boxing
		int a = 10;
		//auto boxing
		Integer x = a;// convertion from primitive to wrapper
	
	
		Integer y = new Integer(a);//manual boxing
		
		System.out.println("a :"+a);
		System.out.println("x :"+x);
		System.out.println("a :"+y);
	}

}
