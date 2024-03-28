package abcmart.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static String url = "jdbc:mysql://localhost/abcmart";
	private static String username = "root";
	private static String password = "Ankit@321";
	static Connection con = null;
	
	public static Connection getMySqlConnection() {
		try {
			con = DriverManager.getConnection(url, username, password);
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}
