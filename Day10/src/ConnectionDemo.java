import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/wipro";
		String username = "root";
		String password = "";
		
		//load the driver and register with DriverManager
		Class.forName(driverClassName);
		System.out.println("COnnection loaded");
		
		//establise the connection
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("COnnection establize");
		
		//perform database queries
			//todo
		
		//close the connection
			con.close();
			System.out.println("COnnection closed");
		
	}

}
