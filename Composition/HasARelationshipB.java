package com.xworkz.java.has.a.relationship.Composition;

public class HasARelationshipB {
	public static void main(String[] args) {
		
		Wings wings = new Wings();
		wings.color = "green";
		
		Bird bird = new Bird();
		bird.name = "parrot";
		bird.fly();
		
		bird.wings = wings;
		System.out.println(" name of bird is:"+ bird.name);
		
		System.out.println(" color of wings is: "+ wings.color);
		bird.wings.lift();
		
		
	}
}
