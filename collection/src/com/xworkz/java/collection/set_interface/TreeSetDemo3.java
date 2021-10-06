package com.xworkz.java.collection.set_interface;

import java.util.TreeSet;

public class TreeSetDemo3 {
	public static void main(String args[]) {
		TreeSet<StringBuffer> set = new TreeSet(new MyComparatorInterfaceDemo1());
		
		set.add(new StringBuffer("java"));
		set.add(new StringBuffer("python"));
		set.add(new StringBuffer("c"));
		set.add(new StringBuffer("golang"));
		set.add(new StringBuffer("ruby&rails"));
		System.out.println(set);
		
	}

}
