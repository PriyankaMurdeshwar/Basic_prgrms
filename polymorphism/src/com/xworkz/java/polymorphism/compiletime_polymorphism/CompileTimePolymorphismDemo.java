package com.xworkz.java.polymorphism.compiletime_polymorphism;

public class CompileTimePolymorphismDemo {
	public static void main(String args[]) {
		FaceBook facebook = new FaceBook();
		facebook.search("priya");
		facebook.search("8050060651l");
		facebook.search("priya,8050060651l");
	}

}
