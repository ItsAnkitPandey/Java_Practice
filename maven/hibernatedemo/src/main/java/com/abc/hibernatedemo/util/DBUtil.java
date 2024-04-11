package com.abc.hibernatedemo.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost/abcmart";
	private static String username = "root";
	private static String password = "Ankit@321";		
	
	static public Connection getOracelDBConnection() {		
		Connection con = null;		
		try {
			Class.forName(driver);
			System.out.println("driver loaded");
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connected");
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}