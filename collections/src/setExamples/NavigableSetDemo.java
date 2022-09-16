package setExamples;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
	public static void main(String[] args) {
		NavigableSet<Integer> numbers=new TreeSet<>();
		numbers.add(103);
		numbers.add(104);
		numbers.add(102);
		numbers.add(100);
		numbers.add(101);

		System.out.println(numbers);

	}

}