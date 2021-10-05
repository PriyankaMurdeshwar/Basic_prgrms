package com.xworkz.java.exception.custom_exception.unchecked_exception;



public class WhatsApp {
	
	void createGroup(String[] names) throws  WhatsAppException{
		if(names.length > 250) {
			WhatsAppException whatsAppExp = new WhatsAppException();
			throw whatsAppExp;
		}
		else {
			System.out.println("your whats app group is created");
		}
	}
	void shareFile(File file) throws WhatsAppException {
		if(file.size > 1024) {
			
			WhatsAppException whatsAppExp = new WhatsAppException();
			throw whatsAppExp;
			
		}
		else {
			System.out.println("file uploaded successfuly");
		}
	}


}
