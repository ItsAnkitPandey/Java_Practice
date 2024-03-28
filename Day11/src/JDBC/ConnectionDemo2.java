package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/wipro";
		String username = "root";
		String password = "Ankit@321";
		
		// load the driver and register with DriverManager
		
			DriverManager.getConnection(url, username, password);
			Class.forName(driverClassName);
			System.out.println("COnnection loaded");

			// establise the connection
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("COnnection establize");
		
		// perform database queries
		// todo

		// close the connection
		
				con = DriverManager.getConnection(url, username, password);
				con.close();
				System.out.println("COnnection closed");
			
	}

}
