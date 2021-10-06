package com.xworkz.java.collection.list;

import java.util.ArrayList;
import java.util.Collection;
public class ArrayListDemo {
	public static void main(String args[]) {
	
	ArrayList list = new ArrayList();
	
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(5);
	list.add(1);
	
	System.out.println("before adding smallList");
	System.out.println("list: "+list);
	
	ArrayList smallList = new ArrayList();
	
	list.add(30);
	list.add(30);
	list.add(30);
	//list.add("priya");
	
	System.out.println("after adding smallList");
	list.addAll(smallList);
	System.out.println("list: "+list);
	
	
	list.removeAll(smallList);
	System.out.println("after removing smallList");
	System.out.println("list: "+list);

}
}
