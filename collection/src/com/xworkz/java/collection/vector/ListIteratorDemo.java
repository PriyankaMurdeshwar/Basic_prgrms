package com.xworkz.java.collection.vector;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList();
		linkedList.add("dog");
		linkedList.add("tiger");
		linkedList.add("cow");
		linkedList.add("dear");
		linkedList.add("rabit");

		ListIterator<String> listItr = linkedList.listIterator();
		while(listItr.hasNext()) {
			
			String animalName = listItr.next();
			if(animalName.equals("rabit")) {
				listItr.add("cat");
			}
			else if(animalName.equals("dear")) {
				listItr.remove();
			}
			
			else if (animalName.equals("dog")) {
				listItr.set("german shepherd");
			}
		}
		
		
		System.out.println(linkedList);
	}

}
