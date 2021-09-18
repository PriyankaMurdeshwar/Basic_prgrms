package com.xworkz.java.object_class.equals_Demo;

public class EqualsTest {
	
	public static void main(String args[]) {
		Trainer asha = new Trainer("Asha","female",6);
		
		Trainer asha1 = new Trainer("Asha","female",6);
		System.out.println(asha.equals(asha1));

	}

}
