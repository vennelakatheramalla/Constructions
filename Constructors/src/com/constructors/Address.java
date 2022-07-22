package com.constructors;

public class Address {
	
	public Address() {
		System.out.println("no-arg constructor");
	}
	
	public void display() {
		System.out.println("display");
	}

	public static void main(String[] args) {
	Address address=new Address();
	address.display();
	}
}
