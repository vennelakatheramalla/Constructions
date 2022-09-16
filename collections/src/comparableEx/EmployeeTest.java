package comparableEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmployeeTest {
	
	
	
	 public static void main(String[] args) {
	        Employee e1 = new Employee(100, "anil", 15000.00);
	        Employee e2 = new Employee(104, "raju", 25000.00);
	        Employee e3 = new Employee(102, "balu", 55000.00);
	        Employee e4 = new Employee(101, "laxmi", 18000.00);
	        Employee e5 = new Employee(103, "surya", 19000.00);
	        Employee e6 = new Employee(103, "surya", 19000.00);
	        
	        List<Employee> employees = new ArrayList<>();
	        // frequently when you performing retrivle operations
//	        System.out.println(employees.capacity());
	        employees.add(e1);
	        employees.add(e2);
	        employees.add(e3);
	        employees.add(e4);
	        employees.add(e5);
	        employees.add(e6);
	        
	        
	        System.out.println(employees);
	        
	        
	        
	       // Collections.sort(employees, new IdBasedSorting());
	        Collections.sort(employees,new NameBasedSorting());
	        Collections.sort(employees, new Comparator<Employee>() {

				@Override
				public int compare(Employee o1, Employee o2) {
					
					return o1.getName().compareTo(o2.getName());
				}
			});
//	        Collections.sort(employees, new Comparator<Employee>() {
//
//	            @Override
//	            public int compare(Employee o1, Employee o2) {
//	                return o1.getId() - o2.getId();
//	            }
//	        });
//	        
//	        Collections.sort(employees,new Comparator<Employee>() {
//
//	        	
//				@Override
//				public int compare(Employee o1, Employee o2) {
//					  return (int) (o1.getSalary() - o2.getSalary());
//					
			//	}
		//	});
	        Iterator<Employee> itr = employees.iterator();
	        while (itr.hasNext()) {
	            Employee employee = itr.next();
//	            if (employee.getName().startsWith("a")) {
	                System.out.println(employee);
//	            }
	        }
}
}
