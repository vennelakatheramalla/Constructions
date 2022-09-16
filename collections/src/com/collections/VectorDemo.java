package com.collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.addElement(122);
		vector.addElement(120);
		vector.addElement(121);
		vector.addElement(123);
		System.out.println(vector);
		// Enumeration<Integer> e = vector.elements();
		// while (e.hasMoreElements()) {
		// System.out.println(e.nextElement());
		// }
		int temp = 121;
		Iterator<Integer> itr = vector.iterator();
		while (itr.hasNext()) {
		Integer number = itr.next();
		if (number == temp) {
		itr.remove();
		} else {
		System.out.println(number);
		}
		}
		}

		}


