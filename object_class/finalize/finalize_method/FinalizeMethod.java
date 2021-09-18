package com.xworkz.java.object_class.finalize.finalize_method;

public class FinalizeMethod {
	
	public static void main(String args[]) {
		Fan fan = new Fan();
		System.out.println(fan);
		
		
		fan = null;
		System.gc();
		
		System.out.println(fan);
	}

}
