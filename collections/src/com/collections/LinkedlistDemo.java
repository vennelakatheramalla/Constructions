package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(100);
		numbers.add(101);
		numbers.add(102);
		numbers.add(103);
		System.out.println("position: 101 " + numbers.get(1));
		System.out.println(numbers);
		System.out.println(numbers.pop());
		System.out.println(numbers);
		System.out.println();
		System.out.println("position: 101 " + numbers.get(0));
		LinkedList<String> countries = new LinkedList<>();
		countries.add("India");
		countries.add("England");
		countries.add("China");
		countries.add("Usa");
		System.out.println(countries);

		LinkedList<Object> countriesAndCodes = new LinkedList<>(countries);
		countriesAndCodes.addAll(numbers);

		Iterator<Object> itr = countriesAndCodes.iterator();
		while (itr.hasNext()) {
		System.out.println(itr.next());
		}
		}

		}


