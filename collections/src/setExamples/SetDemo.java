package setExamples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("viswa");
		s.add("ram");
		s.add("vinny");
		s.add("navy");
		s.add("ram");
		
		System.out.println("set elements are:"+s);
		
		if(s.equals("jaggu")) {
			System.out.println("jaggu is not present");
		}else {
			s.add("jaggu");
			System.out.println("jaggu is added succesfully");
			System.out.println(s);
		}
		
		Set<String> s2=new LinkedHashSet<String>();
		s2.add("surya");
		s2.add("sarita");
		s2.add("mohan");
		s.addAll(s2);
		System.out.println("elements after adding succesfully");
		System.out.println(s);
	}
	

}
