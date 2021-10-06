package com.xworkz.java.collection.set_interface;

import java.util.HashSet;

public class CustomSetDemo {
	
	public static void main(String args[]) {
		
		Perfume fogg = new Perfume("Fogg", "noFlavor",230,"strong");
		Perfume wildStone = new Perfume("WildStone", "noFlavor",300,"strong");
		Perfume axe = new Perfume("AXE", "noFlavor",250,"mild");
		Perfume titan = new Perfume("Titan", "rose",500,"mild");
		Perfume denver = new Perfume("Denver", "something",400,"strong");
		Perfume fogg1 = new Perfume("Fogg", "noFlavor",230,"strong");
		
		
		
		HashSet<Perfume> perfumeSet = new HashSet();
		perfumeSet.add(fogg);
		perfumeSet.add(wildStone);
		perfumeSet.add(axe);
		perfumeSet.add(titan);
		perfumeSet.add(denver);
		
		perfumeSet.add(fogg);// adding duplicate
		perfumeSet.add(fogg1);// here it does equal method and it added in the set so override equal method
		
		//System.out.println(perfumeSet);
		
		for(Perfume perfume : perfumeSet) {
			System.out.println(perfume);
		}
		
		
	}

}
