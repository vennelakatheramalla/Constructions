package com.iq.preparedstatements;



public class ClassDotForNameDemo {
	
	{
		System.out.println("classDot for name method");
	}
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.iq.preparedstatements.ClassDotForNameDemo").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
			
		}
		
	}
	
 


