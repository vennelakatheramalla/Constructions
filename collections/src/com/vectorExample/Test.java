package com.vectorExample;

import java.util.Enumeration;
import java.util.Vector;

public class Test {
	public static void main(String[] args) {

//		NeedOfCollections.add(new Object []{1, 3, 4, 52, 90});

		Vector vector = new Vector();
		System.out.println(vector.isEmpty()+ "\n "+ vector.capacity()+"\n "+vector.size());
		vector.add(12345);// 0
		vector.add(50.00);// 1
		vector.add(45.5f);// 2
		vector.add("createIQ");// 3
		vector.add('c'); // 4
		vector.capacity();
		vector.lastElement();
		System.out.println(vector.isEmpty()+ "\n "+ vector.capacity()+" \n"+vector.size());
//		System.out.println(vector);
//		vector.remove(1);
//		System.out.println(vector);
//		vector.set(0, 40.00);
//		System.out.println(vector);
		Enumeration e = vector.elements();

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}
}


