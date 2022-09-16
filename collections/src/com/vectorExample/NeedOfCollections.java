package com.vectorExample;

import java.util.Arrays;

public class NeedOfCollections {
	public static Object[] add(Object[] obj) {
		if(obj==null) {
			throw new NullPointerException();
		}
		 
		return obj;
	}

	
	// Homogeneous method
//	public static double[] add(double[] arr) {
//		return arr;
//	}
//
//	public static String[] add(String[] arr) {
//		return arr;
//	}
	
	// update, search, remove, 

	public static void printArr(Object[] obj) {
		for (Object number : obj) {
			System.out.println(number);
		}
	}

	public static void main(String[] args) {
		
		// Heterogeneous objects
		Object[] numbers = { 1, 3, 4, 52, 90 };

		Object[] values = { 10.0, 20.0, 30.0 };

		String[] names = { "a", "b", " c" };
		add(numbers);
		printArr(numbers);

		add(values);
		printArr(values);
		printArr(names);
		add(names);
		
		int [] arr=new int [100];
		arr[0] =1;
		arr[1]=2;
		System.out.println(Arrays.toString(arr));

	}

}


