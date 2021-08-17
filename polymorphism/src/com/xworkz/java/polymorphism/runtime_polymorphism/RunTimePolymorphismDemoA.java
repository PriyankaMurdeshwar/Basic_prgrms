package com.xworkz.java.polymorphism.runtime_polymorphism;

public class RunTimePolymorphismDemoA {
	public static void main(String args[]){
		
		RBI rbi = new RBI();
		//rbi.getInterestrate(7.5);
		
		HDFC hdfc = new HDFC();
		//hdfc.getInterestrate(8.5);
		
		Axis axis = new Axis();
		//axis.getInterestrate(9.5);
		
		System.out.println(" interest rate of RBI:"+ rbi.getInterestrate(7.5));
		System.out.println(" interest rate of RBI:"+ hdfc.getInterestrate(8.5));
		System.out.println(" interest rate of RBI:"+ axis.getInterestrate(9.5));
		
		
		
		
	}

}
