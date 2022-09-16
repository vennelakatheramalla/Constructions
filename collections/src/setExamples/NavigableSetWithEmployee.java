package setExamples;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetWithEmployee {
	public static void main(String[] args) {

		NavigableSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				
				return (int) (e1.getSalary() - e2.getSalary());
			}
		});

		
		employees.add(new Employee(103, "balu", 65000.00));
		employees.add(new Employee(102, "ram", 60000.00));
		employees.add(new Employee(100, "chandra", 45000.00));
		employees.add(new Employee(101, "vani", 49000.00));
		employees.add(new Employee(105, "raji", 15000.00));

//		Iterator<Employee> itr = employees.iterator();
//		while (itr.hasNext()) {
//			Employee employee = itr.next();
//			System.out.println(employee);
//		}
		Employee chandra = new Employee(100, "chandra", 45000.00);

		System.out.println("lowest salary: " + employees.lower(chandra));

		System.out.println(employees.higher(new Employee(60000.00)));
		
//		salary>=60000.00
		System.out.println(employees.tailSet(new Employee(60000.00)));
		
//		salary<=60000.00
		
		System.out.println(employees.ceiling(chandra));
		System.out.println(employees.descendingIterator());
		System.out.println(employees.descendingSet());
		System.out.println(employees.floor(chandra));
		System.out.println(employees.headSet(chandra));
		System.out.println(employees.higher(chandra));
		System.out.println(employees.lower(chandra));
		System.out.println(employees.iterator());
		System.out.println(employees.pollFirst());
		System.out.println(employees.pollLast());

	}

}
