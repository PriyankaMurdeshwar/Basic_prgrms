package com.xworkz.java.collection.set_interface;

import java.util.TreeSet;

public class MyComparatorDemo {
	public static void main(String args[]) {
		TreeSet<Character> set = new TreeSet(new ComparatorInterfaceDemo());
		
		set.add('f');
		set.add('d');
		set.add('q');
		set.add('n');
		set.add('p');
		
		System.out.println(set);
		
	}

}
