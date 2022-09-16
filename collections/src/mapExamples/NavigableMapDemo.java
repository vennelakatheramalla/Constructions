package mapExamples;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
	  public static void main(String[] args)
	    {
	        // Instantiate an object
	        // Since NavigableMap
	        // is an interface so we
	        // use TreeMap
	        NavigableMap<String, Integer> nm
	            = new TreeMap<String, Integer>();
	 
	        // Add elements using put() method
	        nm.put("C", 888);
	        nm.put("Y", 999);
	        nm.put("A", 444);
	        nm.put("T", 555);
	        nm.put("B", 666);
	        nm.put("A", 555);
	 
	        // Print the contents on the console
	        System.out.println("Mappings of NavigableMap : "
	                           + nm);
	 
	        System.out.printf("Descending Set  : ",
	                          nm.descendingKeySet());
	        System.out.printf("Floor Entry  : ",
	                          nm.floorEntry("L"));
	        System.out.printf("First Entry  : ",
	                          nm.firstEntry());
	        System.out.printf("Last Key : ", nm.lastKey());
	        System.out.printf("First Key : ",
	                          nm.firstKey());
	        System.out.printf("Original Map : ", nm);
	        System.out.printf("Reverse Map : ",
	                          nm.descendingMap());
	    }

}
