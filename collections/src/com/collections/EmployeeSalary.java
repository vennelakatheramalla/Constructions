package com.collections;


import java.util.Iterator;
import java.util.Stack;

public class EmployeeSalary {
	public static void main(String[] args) {
		
	Stack salary=new Stack();
	salary.push(12000);
	salary.push(15000);
	salary.push(20000);
	salary.push(34000);
	salary.push(24000);
	
	int sum=0;
	Iterator<Integer> itr=salary.iterator();
	while (itr.hasNext()) {
		int i=itr.next();
		sum=sum+i;
	
	}
	System.out.println(sum);

}
}