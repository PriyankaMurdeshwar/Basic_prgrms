package com.xworkz.java.object_class.clone_method;

public class Bus implements Cloneable {
	

	String name = "Volvo";
	Driver driver = new Driver();
	
	public Bus clone() throws CloneNotSupportedException{
		
		return (Bus) super.clone();
		
	}
	@Override
	public String toString() {
		return "Bus [name=" + name + ", driver=" + driver + "]";
	}
	

}
