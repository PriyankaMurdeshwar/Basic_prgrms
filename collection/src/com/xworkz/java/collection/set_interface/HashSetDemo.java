package com.xworkz.java.collection.set_interface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String args[]) {
		
		HashSet<Character> set = new HashSet();
		
		set.add('A');
		set.add('B');
		set.add('E');//// no insertion order
		set.add('D');
		set.add('A');// it returns boolean value
		set.add(null);
		set.add(null);// no duplicates it may be null also
		System.out.println(set);
		
		Iterator<Character> setItr = set.iterator();
		while(setItr.hasNext()) {
			System.out.println(setItr.next());
		}
		
		
		
	}

}
