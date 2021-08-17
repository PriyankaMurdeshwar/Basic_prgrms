package com.xworkz.java.polymorphism.runtime_polymorphism;

public class RunTimePolymorphismDemo {
	public static void main(String args[]) {
		Child child = new Child();
		child.drive();
		
		
		Father father = new Father();
		father.drive();
		
		
		Father child1 = new Child();
		child1.drive();
	}

}
