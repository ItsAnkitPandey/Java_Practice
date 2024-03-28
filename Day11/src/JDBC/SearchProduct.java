package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import utils.DBUtil;

public class SearchProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int productId = sc.nextInt();
		sc.close();

		// connect to db
		Connection con = DBUtil.getMySqlConnection();

		// perform db operations
		String sql = "select * from employee where id = ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String name = rs.getString(2);
				int salary = rs.getInt(3);
				String age = rs.getString(3);
				System.out.println("\nName: " + name + "\nsalary: " + salary + "\nage: " + age);
			} else {
				System.out.println("Product not found with id:" + productId);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		
		//close the connection
		finally {
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
