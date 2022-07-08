package com.college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection connection=null;
	
	public static Connection  getConnection() throws ClassNotFoundException {
		if(connection !=null) {
			return connection;
		}
		else {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "Shikh@2204");
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			 
		}
		return connection;
	}
	
}
