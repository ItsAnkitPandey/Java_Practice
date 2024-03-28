package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import utils.DBUtil;

public class DeleteEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int empId = sc.nextInt();
		sc.close();
		
		
		//connect to database
		Connection con = DBUtil.getMySqlConnection();
		
		//perform databse operations
		String sql = "delete from employee where id = ?";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, empId);
			int noOfRowEffected = ps.executeUpdate();
			if (noOfRowEffected > 0) {
				System.out.println("employee deleted successfully with id: " + empId);
			} else {
				System.out.println("Failed to delete employee with id: "+ empId);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
