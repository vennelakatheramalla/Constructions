package com.constructors;

public class Student1 {
	public Integer RollNum;
	public String Name;
	public String place;
	public double fees;
	
public Student1() {
	
}

public Student1(Integer RollNum,String Name,String Place,Double fees){
	this.RollNum=RollNum;
	this.Name=Name;
	this.place=Place;
	this.fees=fees;
}
	
public void displayDetails() {
	System.out.println("Student RollNum is:" +RollNum);
	System.out.println("Student Name is:" +Name);
	System.out.println("Student place is:" +place);
	System.out.println("Student fees is:" +fees);
}

public static void main(String[] args) {
	Student1 student=new Student1(423,"Vennela","Hyd",45000.00);
	student.displayDetails();
}
}
