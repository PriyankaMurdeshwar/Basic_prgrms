package com.xworkz.java.final_keyword;

public class Water {
	static final String COLOR;// it gives error because not initialized
	static final String SMELL;// it gives error because not initialized
	
	static {
		COLOR = "no color";//error gone
		SMELL = "no smell";//error gone
	}
	{
		//COLOR = "no color"; it gives error.
		// We can't initialize static members inside IIBs
	}

}


//OUTPUT
//no color
//no smell