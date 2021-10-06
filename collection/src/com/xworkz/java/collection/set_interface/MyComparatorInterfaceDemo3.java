package com.xworkz.java.collection.set_interface;

import java.util.Comparator;

public class MyComparatorInterfaceDemo3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		String str1 = o1.toString();
		String str2 = o2.toString();
		
		if(str1.length() < str2.length() ) {
			return -1;
		}
		else if(str1.length() > str2.length() ) {
			return 1;
		}
		else {
			return str1.compareTo(str2);
		}
		
	}

}
