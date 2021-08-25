package Blocks.com.xworkz.java;

public class Charger {
	static String brand;
	String color;
	double price;
	String powerConsumption;
	
	{
		color = "black";
		price = 500.00;
		powerConsumption = "5W";
		System.out.println("IIB1");
	}
	{
		System.out.println("IIB2");
	}
	static{
		brand = "Mi";
		System.out.println("SIB1");
		
	}
	static {
		System.out.println("SIB2");
		
	}
	Charger(){
		System.out.println("constructor");
	}
}
