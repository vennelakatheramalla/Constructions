package com.collections;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		
		Stack stack=new Stack();
		stack.push("vennela");
		stack.push("sarita");
		stack.push("navya");
		stack.push("vishwa");
		//stack.set(0, "vinny");
		System.out.println(stack.size());
		
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack);
//		stack.set(0, "vinny");
//		System.out.println(stack);
	
		//iterator using enumerator
		Enumeration el=stack.elements();
		while (el.hasMoreElements()) {
			System.out.println(el.nextElement());
			
		}
		
		
	//System.out.println(stack);
	}

}
