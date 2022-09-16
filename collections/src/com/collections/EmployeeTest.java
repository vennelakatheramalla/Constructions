package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {
	private static final int Employee = 0;

	public static void main(String[] args) {
		Employee e1 = new Employee(100, "anil", 15000.00);
		Employee e2 = new Employee(104, "raju", 15000.00);
		Employee e3 = new Employee(102, "balu", 15000.00);
		Employee e4 = new Employee(101, "laxmi", 15000.00);
		Employee e5 = new Employee(103, "surya", 15000.00);

		List employees = new ArrayList<>();
		//frequently when you performing retrivle operations
		// System.out.println(employees.capacity());
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		

		//System.out.println(employees);
		Collections.sort(employees);
		Iterator<Employee> itr = employees.iterator();
		while (itr.hasNext()) {
		Employee employee = itr.next();
		if(employee.getName().startsWith("l")) {
		System.out.println(employee);
		
	
		
		}
		
		}
		
	
}}

