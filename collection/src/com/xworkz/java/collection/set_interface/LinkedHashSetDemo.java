package com.xworkz.java.collection.set_interface;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

			
		LinkedHashSet<Double> linkedHashSet = new LinkedHashSet();
		
		linkedHashSet.add(10.0);
		linkedHashSet.add(20.0);
		linkedHashSet.add(40.0);
		linkedHashSet.add(60.0);
		linkedHashSet.add(50.0);
		linkedHashSet.add(50.0);// it wont add it ignores
		
		System.out.println(linkedHashSet);
		
		
	}

}
