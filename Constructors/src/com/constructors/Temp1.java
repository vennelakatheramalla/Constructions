package com.constructors;

//changing the order of constructors

public class Temp1 {
Temp1(){
	System.out.println("default");
}


Temp1(int x){

this();
System.out.println(x);
}

Temp1(int x, int y){
	this(5);
	System.out.println(x*y);
}

public static void main(String[] args) {
	new Temp1(8,10);
}
}