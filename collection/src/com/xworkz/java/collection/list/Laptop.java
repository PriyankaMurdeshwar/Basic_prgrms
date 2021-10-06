package com.xworkz.java.collection.list;

public class Laptop {
	String brand;
	String color;
	double price;
	
	Laptop(String brand, String color, double price){
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}

}
