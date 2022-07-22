package com.constructors;

public class Employee {
	
	public Integer employeeId;
	public String employeeName;
	public double employeeSalary;
	public String employeeAdress;


//public Employee() {
//	System.out.println("Default constructor");
//}

public Employee(Integer employeeId,String employeename,double employeesalary,String employeeAdress) {
	this.employeeId=employeeId;
	this.employeeName=employeename;
	this.employeeSalary=employeesalary;
	this.employeeAdress=employeeAdress;
}


public Employee() {
	// TODO Auto-generated constructor stub
}


public void save() {
	System.out.println("Displaying Employee details");
}

public void showDetails() {
	System.out.println("The employeeId is:" +employeeId);
	System.out.println("The employeeName is:" +employeeName);
	System.out.println("The employeeSalary is:" +employeeSalary);
	System.out.println("The employeeAdress is :" +employeeAdress);
	
}

public static void main(String[] args) {
	Employee employee=new Employee(56753,"Vennela",65000.0000,"Hyderabad");
	employee.showDetails();
	Employee employee2=new Employee(56754,"Navya",65000.0000,"Hyderabad");
	employee2.showDetails();
	
	Employee employee3=new Employee();
	employee3.save();

}	
}