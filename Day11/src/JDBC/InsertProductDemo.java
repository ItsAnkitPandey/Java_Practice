package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertProductDemo {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/wipro";
		String username = "root";
		String password = "Ankit@321";
		Connection con = null;

		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("COnnection establize");

			String sql = "insert into employee values(101,'ANkit', 25000,'22')";

			Statement st = con.createStatement();
			int rowsAffected = st.executeUpdate(sql);
			if (rowsAffected > 0) {
				System.out.println("Product Saved");
			} else {
				System.out.println("Failed to save product");
			}

		} catch (SQLException e) {
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
