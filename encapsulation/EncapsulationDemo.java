package com.xworkz.java.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String args[]) {
		
		Bag bag = new Bag();
		bag.setBrand("Wild craft");
		bag.setColor("Black");
		bag.setPrice(2000.00);
		
		System.out.println(bag.getBrand());
		System.out.println(bag.getColor());
        System.out.println(bag.getPrice());
	}

}
