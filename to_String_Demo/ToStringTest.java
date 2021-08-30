package com.xworkz.java.object_class.to_String_Demo;

public class ToStringTest {
	
	public static void main(String args[]) {
		Ipad ipad = new Ipad("4GB","Apple","12MP",30000);
		
		//System.out.println(ipad);// it prints fully qualified class name with hexadecimal value at the rate of hashcode
		//internally compiler writes as System.out.println(ipad.toString());  it takes from Object class
		
		System.out.println(ipad.toString());
	}

}
