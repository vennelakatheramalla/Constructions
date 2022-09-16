package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayExa {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("pen");
		arrayList.add("bat");
		arrayList.add("chair");
		//System.out.println(arrayList);
		
		arrayList.set(1, "bottle");
		arrayList.remove(0);
		
		System.out.println(arrayList);
		

		Collections.sort(arrayList);
		
		for(String str:arrayList) {
			System.out.println(str);
		}
		Collections.reverse(arrayList);
		
	}
}