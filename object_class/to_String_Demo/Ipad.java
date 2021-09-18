package com.xworkz.java.object_class.to_String_Demo;

public class Ipad {
	String ramSize;
	String brand;
	String cameraQuality;
	double price;
	
	Ipad(String ramSize, String brand, String cameraQuality, double price){
		this.ramSize = ramSize;
		this.brand = brand;
		this.cameraQuality = cameraQuality;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ipad [ramSize=" + ramSize + ", brand=" + brand + ", cameraQuality=" + cameraQuality + ", price=" + price
				+ "]";
	}

}
