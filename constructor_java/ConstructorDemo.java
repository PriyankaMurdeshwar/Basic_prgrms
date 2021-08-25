package com.xworkz.java.constructor.constructor_java;

public class ConstructorDemo {
	public static void main(String args[]) {
		Flight indigo = new Flight();
		 
		 System.out.println(indigo.name);
		 System.out.println(indigo.number);
		 System.out.println(indigo.capacity);
		 System.out.println(indigo.source);
		 System.out.println(indigo.destination);
		 
		 Flight airindia = new Flight("air-india","I560",300,"Bangalore", "Mangalore" );
			System.out.println(airindia.name);
			System.out.println(airindia.number);
			System.out.println(airindia.capacity);
			System.out.println(airindia.source);
			System.out.println(airindia.destination);
			
		Flight f = new Flight();
		System.out.println(f.name);
		
		
	}

}
