package com.iq.callablestatements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProcedureEx1 {

	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/kalyan", "root", "root");
			System.out.println(connection);
		} catch (SQLException e) {
			e.printStackTrace();
			
			CallableStatement cs=connection.prepareCall("{call add(?,?)}");  
			cs.setInt(1, 10);
			cs.setInt(2, 20);
			cs.execute();
			cs.executeUpdate();
			
			System.out.println("sucesss");
			
			cs.close();
			connection.close();
		
		
		}
	}
}
