package com.xworkz.java.collection.set_interface;

import java.util.TreeSet;

public class TreeSetDemo4 {
	public static void main(String args[]) {
		TreeSet set = new TreeSet(new MyComparatorInterfaceDemo3());
		
		set.add("priya");
		set.add("yeesha");
		set.add("prasad");
		set.add(new StringBuffer("mani"));
		set.add(new StringBuffer("raj"));
		set.add(new StringBuffer("bharat"));
		
		System.out.println(set);
	}

}
