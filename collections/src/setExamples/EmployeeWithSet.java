package setExamples;

import java.util.HashSet;

public class EmployeeWithSet {
	public static void main(String[] args) {
		Employee e1 = new Employee(100, "anil", 15000.00);
		Employee e2 = new Employee(104, "raju", 15000.00);
		Employee e3 = new Employee(102, "balu", 15000.00);
		Employee e4 = new Employee(101, "laxmi", 15000.00);
		Employee e5 = new Employee(103, "surya", 15000.00);
		Employee e6 = new Employee(100, "anil", 15000.00);

		HashSet<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

		for (Employee employee : employees) {
			System.out.println(employee);
		}

	}

}
