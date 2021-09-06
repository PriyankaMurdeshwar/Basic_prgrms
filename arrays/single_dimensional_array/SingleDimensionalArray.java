package com.xworkz.java.arrays.single_dimensional_array;

public class SingleDimensionalArray {
	
	public static void main(String args[]) {
		//int arr[];
		
		int arr[] = new int[5];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++ ) {
			arr[i] = num;
			num++;
			System.out.println(arr[i]);
		}
		//for(int i = 0; i < 6; i++ ) {
			//System.out.println(arr[i]);
			
	//	}
		
	}

}
