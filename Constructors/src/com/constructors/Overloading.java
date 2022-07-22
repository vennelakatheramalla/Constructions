package com.constructors;

public class Overloading {
	public void sum(int a, long b) {
		System.out.println(a+b);
	}
	public void sum(int a, int b, int c) {
		System.out.println(a+b+c);
	}
public static void main(String[] args) {
	Overloading obj=new Overloading();
	obj.sum(3, 5);
	obj.sum(4, 5, 7);
}
}
