package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
//		
//		ArrayList arrayList=new ArrayList<>();
//		arrayList.add("pen");
//		arrayList.add("bat");
//		arrayList.add("chair");
//		System.out.println(arrayList);
		
		
		//using iterator
//		ArrayList arrayList=new ArrayList<>();
//		arrayList.add("pen");
//		arrayList.add("bat");
//		arrayList.add("chair");
//		Iterator itr=arrayList.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("pen");
		arrayList.add("bat");
		arrayList.add("chair");
		//arrayList.remove(1);
	//	Collections.sort(arrayList);
		
		//using for each loop
		for(String things:arrayList) {
			System.out.println(things);
			
		}
	}

}
