package com.xworkz.java.has.a.relationship.aggregation;

public class HasARelationshipA {
	public static void main(String[] args) {
		God god = new God();
		god.name = "Shri mahaganapathi";
		
		
		Temple temple = new Temple();
		god.temple = temple;
		System.out.println("name of god is:"+ god.name);
		god.creation();
		temple.templeName = "Shri mahaganapathi temple";
		temple.templePlace = "Sirsi";
		System.out.println(" name of the temple:"+ god.temple.templeName);
		System.out.println(" place of the temple:"+ god.temple.templePlace);
		
		
	}

}
