package com.xworkz.java.exception.custom_exception.unchecked_exception;

public class WhatsAppTest {
	
	public static void main(String args[]) {
		String[] names = { "priya","yeesha"," vaibhu"};
		
		File file = new File();
		WhatsApp whatsApp = new WhatsApp();
		//whatsApp.createGroup(names); here it gives error handle with try catch
		
		try {
			whatsApp.createGroup(names);
			whatsApp.shareFile(file);
		} catch (WhatsAppException e) {
			
			if(names.length > 250) {
				System.out.println(e.getMessage());
			}
			else {
				System.out.println(e.toString());
			}
		}
		
}
}

