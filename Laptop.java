package com.xworkz.java.laptop;

import java.sql.*;

public class Laptop {
	public static void main(String args[]) {
		String url = "jdbc:mysql://localhost:3306/laptop";
		String userName = "root";
		String password = "w1n5t0n";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =  DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);
		}
		catch (SQLException sqlException) {
			// TODO Auto-generated catch block
			System.out.println(sqlException.getMessage());
		} 
		catch (ClassNotFoundException classNotFoundException) {
			
			//System.out.println(classNotFoundException.getMessage());
			classNotFoundException.printStackTrace();
		}
	
		
	} 
	}


