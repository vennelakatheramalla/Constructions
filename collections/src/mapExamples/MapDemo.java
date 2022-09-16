package mapExamples;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
	public static void main(String[] args) {
		
		Map<String, String> countries=new HashMap<String,String>();
		System.out.println(countries.isEmpty());
		//System.out.println(countries.size());
		countries.put("india", "NewDelhi");
		countries.put("England", "London");
		countries.put("Russia", "Moscow");
		countries.put("Australia", "Sidney");
		countries.put("China", "Beezing");
		countries.put(null, null);
		countries.put("India", "Mumbai");
		System.out.println(countries.size());
		//System.out.println(countries.isEmpty());
		System.out.println(countries);
		//System.out.println(countries.isEmpty());
		
		for (Entry<String, String> entry : countries.entrySet()) {
			System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
		}
		//System.out.println(countries);
		//System.out.println(countries.replace("India", "Mumbai", "Goa"));
		System.out.println("................");
		Collection<String> values = countries.values();
		Iterator<String> itr = values.iterator();
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		
		}
		System.out.println("...........");
		Iterator<Entry<String, String>> iterator = countries.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<String, String> entries = iterator.next();
			System.out.println(entries.getKey() + " " + entries.getValue());
		}

		System.out.println(" ------------------------------------------------");
		countries.entrySet().stream().forEach(c -> System.out.println(c.getKey() + " " + c.getValue()));

		String input = "Dubai";
		System.out.println(countries);

		if (countries.containsValue(input)) {
			System.out.println(countries);
		} else {
			countries.putIfAbsent("United Arab", input);
		}
		System.out.println(countries);
		
	}
	}


