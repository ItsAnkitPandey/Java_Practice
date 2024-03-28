package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.DBUtil;

public class InsertDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee id:");
		int empId = sc.nextInt();
		System.out.println("Enter employee name:");
		String empName = sc.next();
		System.out.println("Enter employee salary:");
		int empSalary = sc.nextInt();
		System.out.println("Enter employee age:");
		String empAge = sc.next();

		sc.close();

		// connect to database
		Connection con = DBUtil.getMySqlConnection();

		// perform db operations
		String sql = "insert into employee values(?,?,?,?)";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, empId);
			ps.setString(2, empName);
			ps.setInt(3, empSalary);
			ps.setString(4, empAge);
			int noOfRowEffected = ps.executeUpdate();
			if(noOfRowEffected > 0) {
				System.out.println("Employee Created successfully");
			}
			else {
				System.out.println("Employee not Created : some error occured");
			}
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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