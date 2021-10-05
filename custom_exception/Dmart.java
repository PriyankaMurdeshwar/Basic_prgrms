package com.xworkz.java.exception.custom_exception;

import java.util.Arrays;

public class Dmart {
	
	String dmartStore[] = {"dolls", "oil","choco","dry fruits", "biscuites"};
	
	void searchItem(String itemName) throws DmartExp{
		System.out.println(Arrays.binarySearch(dmartStore, itemName));
		if(Arrays.binarySearch(dmartStore, itemName)!= -1) {
			System.out.println("Item is available please buy it");
		}
		else {
			DmartExp  dmartExp = new DmartExp();
			throw dmartExp;
		}
	}

}
