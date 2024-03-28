package assignment11;

import java.sql.*;

public class StudentRecordManager {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/wipro";
    static final String USER = "root";
    static final String PASS = "Ankit@321";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();

            // Create
            String sql = "INSERT INTO students (name, age, grade) VALUES ('John', 20, 'A')";
            stmt.executeUpdate(sql);
            System.out.println("Record inserted successfully.");

            // Read
            sql = "SELECT id, name, age, grade FROM students";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");

                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Grade: " + grade);
            }
            rs.close();

            // Update
            sql = "UPDATE students SET grade='B' WHERE name='John'";
            int rowsUpdated = stmt.executeUpdate(sql);
            System.out.println("Records updated: " + rowsUpdated);

            // Delete
            sql = "DELETE FROM students WHERE age > 25";
            int rowsDeleted = stmt.executeUpdate(sql);
            System.out.println("Records deleted: " + rowsDeleted);
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
