package com.xworkz.java.arrays.ArrayDemo;
import java.util.Scanner;

public class StringArrayDemo {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		String arr[] = new String[5];
		for(int i = 0; i < arr.length; i++) {
		System.out.println("enter");
		arr[i] = scanner.next();
		System.out.println(arr[i]);
		}
		
	}

}
