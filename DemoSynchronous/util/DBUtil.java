package com.hsbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection connection;
	public static Connection getConnection() {
		try {
			if(connection == null) {
				System.out.println("---------------------Connection established-----------------");
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/emppayroll","root","root");
			}
			return connection;
		}
		catch(ClassNotFoundException | SQLException e) {
			return null;
		}
	}
	
	public static void close() {
		if(connection != null) {
			try {
				connection.close();
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
