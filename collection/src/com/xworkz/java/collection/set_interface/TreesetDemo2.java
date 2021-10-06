package com.xworkz.java.collection.set_interface;

import java.util.TreeSet;

public class TreesetDemo2 {
	public static void main(String args[]) {
		
		TreeSet<String> set = new TreeSet( new MyComparatorInterfaceDemo() );
		set.add("asha");
		set.add("asmi");
		set.add("akash");
		set.add("abhi");
		
		System.out.println(set);
		
	}

}
