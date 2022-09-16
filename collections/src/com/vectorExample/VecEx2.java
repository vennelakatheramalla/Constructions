package com.vectorExample;

import java.util.Vector;

public class VecEx2 {
	public static void main(String[] args) {
		
		Vector vec=new Vector<>(2);
		//Vector vec=new Vector<>(2, 4);
		vec.add("id");
		vec.add("name");
				
		vec.addElement("place");
		vec.addElement("pincode");
		vec.add(1, vec);
		vec.set(0, vec);
		vec.capacity();
		System.out.println("elements are:"+vec);
		System.out.println(vec.clone());
		System.out.println(vec.capacity());
		System.out.println("size is:"+vec.size());
		vec.addElement("hno");
		vec.addElement("dist");
		System.out.println("after insertion size:"+vec.size());
		System.out.println("after insertion capacity:"+vec.capacity());
		
	}

}
