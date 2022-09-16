package comparableEx;

import java.util.ArrayList;
import java.util.List;

public class EmpTest {
	


public static void main(String[] args) {
    Employee e1 = new Employee(100, "anil", 15000.00);
    Employee e2 = new Employee(104, "raju", 25000.00);
    Employee e3 = new Employee(102, "balu", 55000.00);
    Employee e4 = new Employee(101, "laxmi", 18000.00);
    Employee e5 = new Employee(103, "surya", 19000.00);
Employee e6 = new Employee(103, "surya", 19000.00);
List<Employee> employees = new ArrayList<>();
// frequently when you performing retrivle operations
//System.out.println(employees.capacity());
employees.add(e1);
employees.add(e2);
employees.add(e3);
employees.add(e4);
employees.add(e5);
employees.add(e6);
System.out.println(employees);
}
}