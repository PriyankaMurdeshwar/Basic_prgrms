package com.xworkz.java.collection.set_interface;

import java.util.Comparator;

public class ComparatorInterfaceDemo implements Comparator<Character>{

	@Override
	public int compare(Character c1, Character c2) {
		
		if(c1<c2) {
			return 1;
		}
		else if(c1>c2) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	//@Override
	//public int compare(Character c1, Character c2) {
	// return c1.compareTo(c2); ascending order
	
	//// return -(c1.compareTo(c2)); descending order
	
	// return c2.compareTo(c1); descending order
	// return -(c2.compareTo(c1)); ascending order
	
	//return +1; it prints in the insertion order
	
	//return 0; stores only first obj and it consider remaining as duplicate
	
	
	
	

}
