import java.sql.*;

public class SimpleSelect {
    // Database connection details
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";
    static final String QUERY = "SELECT id, name FROM employees";

    public static void main(String[] args) {
        // Use try-with-resources to ensure resources are closed automatically
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            
            // Loop through the result set
            while (rs.next()) {
                // Retrieve data by column name
                int id = rs.getInt("id");
                String name = rs.getString("name");

                // Print the result
                System.out.println("ID: " + id + ", Name: " + name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
