package setExamples;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class LinkedHashsetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> weekDays = new LinkedHashSet<>();
		weekDays.add("Mon day");
		weekDays.add("Thues day");
		weekDays.add("Wedness day");
		weekDays.add("Thurs day");
		weekDays.add("Fri day");
		weekDays.add("Satur day");
		weekDays.add("Sun day");
		weekDays.add("Thues day");
		weekDays.add(null);
		System.out.println(weekDays);

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(101);
		numbers.add(103);
		numbers.add(100);
		numbers.add(102);
		System.out.println(numbers);

		LinkedHashSet<Object> daysAndNumbers = new LinkedHashSet<>(weekDays);
		daysAndNumbers.addAll(numbers);
		System.out.println(daysAndNumbers);

	}

}
