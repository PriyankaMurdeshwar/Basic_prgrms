package com.xworkz.java.exception.custom_exception;

public class Priyanka {
	
	public static void main(String args[]) {
		Dmart dmart = new Dmart();
		
		try{
			dmart.searchItem("biscuites");
		}
		catch(DmartExp e){
			System.out.println(e);
		}
	}

}
