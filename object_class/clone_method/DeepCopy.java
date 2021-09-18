package com.xworkz.java.object_class.clone_method;

public class DeepCopy {
	public static void main(String args[]) {
		
		Lock lock = new Lock("Godrej");
		Door door = new Door("Wooden",lock);
		
		try {
			Door doorCopy = door.clone();
			System.out.println(door);
			System.out.println(doorCopy);
			
			System.out.println("------------");
			doorCopy.lock.brand = "Yuropa";
			System.out.println(door);
			System.out.println(doorCopy);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
}

}
