package com.xworkz.java.wrapper_classes.boxing;

public class UnboxingDemo {
	public static void main(String args[]) {
		
		Integer i = new Integer(100);
		int j = i;//auto unboxing
		Integer p = 45;
		int o = p;
		System.out.println("i :"+i);
		System.out.println("j :"+j);
		System.out.println("p :"+p);
		System.out.println("o :"+o);
		
		
		int k = i.intValue();//manual unboxing
		System.out.println("k :"+k);
		Float f = 1000.98f;
		float g = f.floatValue();//manual unboxing
		
		System.out.println("f :"+f);
		System.out.println("g :"+g);
	}

}
