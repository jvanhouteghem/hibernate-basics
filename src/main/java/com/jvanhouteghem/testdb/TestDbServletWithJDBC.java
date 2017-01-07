package com.jvanhouteghem.testdb;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDbServletWithJDBC {
	
	public static void main(String[] args) {

		String user = "springstudent";
		String pass = "springstudent";
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		// get connection to database
		try {
			System.out.println("Connecting to database " + jdbcUrl);
			Class.forName(driver);
			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
			System.out.println("Connection successfull");
			myConn.close();
		} catch (Exception exc){
			System.out.println(exc);
		}
	}

}
