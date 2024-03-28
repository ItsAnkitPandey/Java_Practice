package Assignment12;
import java.sql.*;

public class OracleDAO {
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL = "jdbc:mysql://localhost/wipro";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Ankit@321";

    private Connection connection = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
  
    public void connect() {
        try {          
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void close() {
        try {
            if (resultSet != null)
                resultSet.close();
            if (statement != null)
                statement.close();
            if (preparedStatement != null)
                preparedStatement.close();
            if (connection != null)
                connection.close();
            System.out.println("Connection closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert data into the database
    public void insertData(String name, int age) {
        try {
            String sql = "INSERT INTO oracle (name, age) VALUES (?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve data from the database
    public void retrieveData() {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM oracle");
            while (resultSet.next()) {
                System.out.println("Name: " + resultSet.getString("name") + ", Age: " + resultSet.getInt("age"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update data in the database
    public void updateData(String name, int newAge) {
        try {
            String sql = "UPDATE oracle SET age=? WHERE name=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, newAge);
            preparedStatement.setString(2, name);
            preparedStatement.executeUpdate();
            System.out.println("Data updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete data from the database
    public void deleteData(String name) {
        try {
            String sql = "DELETE FROM oracle WHERE name=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.executeUpdate();
            System.out.println("Data deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OracleDAO dao = new OracleDAO();
        dao.connect();

        // Perform CRUD operations
        dao.insertData("Ankit", 20);
        dao.insertData("Sohan", 18);

        dao.retrieveData();

        dao.updateData("Ankit", 22);

        dao.deleteData("Sohan");

        dao.retrieveData();

        dao.close();
    }
}

