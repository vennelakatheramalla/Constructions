package com.constructors;

public class Languages {
public String language1;
public String language2;
public String language3;
public String language4;



public Languages() {
}

public Languages(String language1,String language2,String language3,String language4) {
	this.language1=language1;
	this.language2=language2;
	this.language3=language3;
	this.language4=language4;
}

public void dispalyDetails() {
	System.out.println("first language is:" +language1);
	System.out.println("Second language is:"+language2);
	System.out.println("Third language is:" +language3);
	System.out.println("Fourth language is:" +language4);
}

public static void main(String[] args) {
	Languages lan=new Languages("c","java","python","oracle");
	lan.dispalyDetails();
}}