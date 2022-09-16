package mapExamples;

import java.util.HashSet;
import java.util.Set;

public class SetIntImp {

	public static void main(String[] args) {
		Set<String> names = new HashSet<>();
		//hash code is 
		names.add(null);
		names.add("anil"); //===> null
		names.add("vamshi");
		names.add("surya");
		names.add("navya");
		names.add("anil");// ====> false

		System.out.println(names);
		
		// return add(key--> E  present) ==null --------------> (anil,  PRESENT)===> null
	}

}


