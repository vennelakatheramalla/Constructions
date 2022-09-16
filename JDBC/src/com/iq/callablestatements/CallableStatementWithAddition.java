package com.iq.callablestatements;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

public class CallableStatementWithAddition {
//select
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
		}
		public static void main(String[] args) {
			Connection connection=null;
			CallableStatement cs=null;
			try {
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/kalyan", "root", "root");
				// cs=connection.prepareCall("{call addition(?, ?, ?)}"); 
				//cs.setInt(1, 10);
				//cs.setInt(2, 20);
			//	cs.registerOutParameter(3, Types.INTEGER);
				//System.out.println(cs.getInt(3));
			//	cs.execute();
				cs=connection.prepareCall("{call employee_select_procedure()}");
		ResultSet rs=cs.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getDouble(3));
			System.out.println(rs.getString(4));
		}
		
			
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			finally {
				if(connection!=null && cs!=null ) {
					
					try {
						cs.close();
						connection.close();
					} catch (SQLException e) {
					
						
						e.printStackTrace();
					}
					
				}
			}
			
			
		}
		
	}


