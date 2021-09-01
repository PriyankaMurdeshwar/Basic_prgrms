package com.xworkz.java.object_class.clone_method;

public class ShallowCopy {
	public static void main(String args[]) {
		Bus bus = new Bus();
		Bus busOfCopy = null;
		
		try {
			busOfCopy = bus.clone();
		} catch(CloneNotSupportedException e){
			
			e.printStackTrace();
		}
		
		System.out.println(bus);
		System.out.println(busOfCopy);
		System.out.println("---------------------------");
		bus.name = "Scania";
		System.out.println(bus);
		System.out.println(busOfCopy);
		System.out.println("---------------------------");
		//driver.name = "Ramu";
		bus.driver.name="Ramu";
		System.out.println("---------------------------");
		System.out.println(bus);
		System.out.println(busOfCopy);
		
		
		
	}
}
