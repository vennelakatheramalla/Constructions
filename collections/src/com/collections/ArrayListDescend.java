package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDescend {
	public static void main(String args[]) {

		// Creating a list of languages
		List<String> list1 = new ArrayList<String>();
		list1.add("Java");
		list1.add("python");
		list1.add("C");
		list1.add("C++");
		list1.add("Kotlin");
		list1.add("Javascript");

		// Sorting the list means make it into descending order

		Collections.sort(list1, Collections.reverseOrder());
		// System.out.println("Sorted arraylist: " + "in descending order: " + list1);

		// Traversing list through the for-each loop
		for (String programs : list1) {
			System.out.println(programs);
		}

		System.out.println("-----------");
		// Creating a list of integers
		List<String> list2 = new ArrayList<String>();
		list2.add("11225");
		list2.add("22222");
		list2.add("34432");
		list2.add("89098");
		list2.add("62827");
		list2.add("46222");

		// Sorting the list
		Collections.sort(list2, Collections.reverseOrder());
		for (String numbers : list2) {
			System.out.println(numbers);

		}
	}
}


