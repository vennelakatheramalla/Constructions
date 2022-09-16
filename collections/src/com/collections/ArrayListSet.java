package com.collections;

import java.util.ArrayList;

public class ArrayListSet {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();

		al.add("Wipro");
		al.add("Infosys");
		al.add("Microsoft");
		al.add("Google");
		al.add("Amazon");
		al.add("Flipkart");
		al.add("Oracle");
		al.add("Apple");

		System.out.println(al);

		// accessing the element
		// it will return the 2nd element, because index starts from 0
		al.get(2);
		System.out.println("Returning element: " + al.get(2));
		System.out.println("----------------------");

		// changing or update the element
		al.set(1, "Tata consultancy services");
		System.out.println("updated element no index 1 is " + al.set(1, "Tata consultancy services"));
		// System.out.println(al); // after set or updated element outcome is
		System.out.println("------------");

		for (String tech : al) {
			System.out.println(tech);
		}

	}
}


