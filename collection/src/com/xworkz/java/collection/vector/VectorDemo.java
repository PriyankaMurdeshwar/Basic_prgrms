package com.xworkz.java.collection.vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String args[]) {
		Vector<Character> vector = new Vector();
		vector.add('a');
		vector.add('a');
		vector.add('a');
		vector.add('a');
		vector.add('a');
		System.out.println(vector);
		
		
		Enumeration<Character> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}

}
