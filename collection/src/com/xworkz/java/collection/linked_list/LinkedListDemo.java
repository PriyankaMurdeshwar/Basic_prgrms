package com.xworkz.java.collection.linked_list;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList();
		
		list.add("mobile");
		list.add("Tv");
		list.add("pen");
		list.add("fan");
		
		System.out.println(list);
		
		
		ListIterator<String> listItr = list.listIterator();
		while(listItr.hasNext()) {
			System.out.println(listItr.next());
		}
		
	}

}
