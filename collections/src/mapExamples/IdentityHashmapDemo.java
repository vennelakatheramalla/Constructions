package mapExamples;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IdentityHashmapDemo {
	   public static void main(String args[]) {  
		       
		      Map<String, String> ihm = new IdentityHashMap<>();  
		
		      ihm.put("Priya", "10100");  
		      ihm.put("navya", "23290");  
		      ihm.put("Shreya", "23330");  
		      ihm.put("vennela", "45000");  
		      ihm.put("sarita", "67700");  
		       
		      System.out.println(ihm.entrySet());  
		       
		      Set set=ihm.entrySet();
		      Iterator i = set.iterator();  
		      
		      while(i.hasNext()) {  
		         Map.Entry me = (Map.Entry)i.next();  
		         System.out.print(me.getKey() + ": ");  
		         System.out.println(me.getValue());  
		      }  
		      System.out.println();  
		      System.out.println(ihm.keySet());
		      System.out.println(ihm.values());
		      System.out.println(ihm.isEmpty());
		      System.out.println(ihm.containsKey("Priya"));
		      System.out.println(ihm.containsValue("67700"));
		      System.out.println(ihm.containsKey("chitti"));
		      System.out.println(ihm.remove("Shreya"));
		      System.out.println(ihm.replace("vennela", "10000"));
		      //keys are unique
		     // System.out.println(ihm.replace("vinny", "23290"));
		      System.out.println("after removing:"+ihm);
		      
		      
		      System.out.println("Size of IdentityHashMap is: " + ihm.size());  
		   }  

}
