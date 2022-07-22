
package com.constructors;

public class MethodOverloading {
	public void save() {
System.out.println("Default parameter");		
	}

private  int save(int a){
	System.out.println("Id"+a);
	return a;
}

protected void save(int a, String b){
	System.out.println("Age and Name"+a+" "+b);
	
}

final String save(long a, String b,String c ){
	System.out.println("PhoneNumber: " + a + " Place: "+ b + " Name: "+c);
	return b;
}
public static void main(String[] args) {
	MethodOverloading obj=new MethodOverloading();
	obj.save(23);
	obj.save(23, "Vennela");
	obj.save(9014437805l, "Hyd", "Mohan");
}
}