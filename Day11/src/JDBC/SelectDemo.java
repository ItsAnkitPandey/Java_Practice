package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/wipro";
		String username = "root";
		String password = "Ankit@321";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("COnnection establize");
			String sql = "select * from employee";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int salary = rs.getInt(3);
				String age = rs.getString(4);
				System.out.println("id: "+ id + " name: "+ name + " salary: " + salary + " age: " + age);
			}
		}
		catch (SQLException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		} finally {
			try {
				if (con != null) {
					con.close();
					System.out.println("COnnection closed");
				}
			} catch (SQLException e) {
				e.getStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}

}
