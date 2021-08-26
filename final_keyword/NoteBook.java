package com.xworkz.java.final_keyword;

public class NoteBook {
	final int NO_OF_PAGES;// it gives error because not initialized
	
	{
		NO_OF_PAGES = 200;// error gone
	}
	//noOfPages = 100; we can't do like this because for each object all IIBs and SIBs gets executed.

}

//OUTPUT
//200