package com.xworkz.java.inheritance.hierarchical_inheritance;

public class HierarchicalInheritance {
	public static void main(String args[]) {
		Activa activa = new Activa();
		activa.quality();
		activa.startStop();
		
		HondaCity hondacity = new HondaCity();
		hondacity.quality();
		hondacity.display();
		hondacity.fullLED();
	}

}
