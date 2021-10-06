package com.xworkz.java.collection.vector;

import java.util.Stack;

public class StackDemo {
public static void main (String args[]) {
	
	
	Stack<Integer> stack = new Stack();
	
	stack.push(1);
	stack.push(2);
	stack.push(3);
	stack.push(4);
	stack.push(5);
	
	System.out.println(stack);//[1,2,3,4,5]
	stack.pop();
	
	System.out.println(stack);//[1,2,3,4]
	
	
	System.out.println("top of obj in stack: "+ stack.peek());
	stack.pop();
	System.out.println("top of obj in stack: "+ stack.peek());
	
	System.out.println(stack);
	System.out.println("Search 1: "+stack.search(1));
	System.out.println("Search 2: "+stack.search(2));// it returns distance from top to obj which we mentioned in search()
	
	
	System.out.println("Search 4: "+stack.search(4));//-1
	
}
}

