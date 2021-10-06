package com.xworkz.java.collection.set_interface;

import java.util.Comparator;

public class MyComparatorInterfaceDemo implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);// it gives descending
	}
	
	

}
