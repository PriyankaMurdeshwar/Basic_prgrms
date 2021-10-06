package com.xworkz.java.collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericArrayListDemo {
	public static void main(String args[]) {
		Laptop dell = new Laptop("Dell", "black", 20000);
		Laptop lenovo = new Laptop("Lenovo", "black", 25000);
		Laptop hp = new Laptop("Hp", "gray", 15000);
		Laptop thinkPad = new Laptop("ThinkPad", "black", 10000);
		Laptop apple = new Laptop("Apple", "silver", 50000);
		
		ArrayList<Laptop> laptopList = new ArrayList();
		
		laptopList.add(dell);
		laptopList.add(lenovo);
		laptopList.add(hp);
		laptopList.add(thinkPad);
		laptopList.add(apple);
		
		
		Iterator itr = laptopList.iterator();
		
		while(itr.hasNext()) {
			Laptop laptop = (Laptop)itr.next();
			System.out.println(laptop);
			
			System.out.println("laptop's which have black color and price less than 20000");
			Laptop laptops = (Laptop)itr.next();
			if(laptops.color == "black" && laptops.price <= 20000) {
				System.out.println("laptop");
				
			}
			
			}
		
		}
		
	}


