package com.iq.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchEx1 {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}  
		  
		  
		public static void main(String args[])throws Exception{ 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kalyan", "root", "root"); 
			con.setAutoCommit(false);  
			  
		Statement stmt=con.createStatement();  
		stmt.addBatch("insert into employee values(187,'abhi',40000.00,'abi@gmail.com')");  
		stmt.addBatch("insert into employee values (199,'umesh',50000.00,'um@gmail.com')"); 
		  
		stmt.executeBatch();//executing the batch  
		  
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
		}  
		con.close();  
		}}  


