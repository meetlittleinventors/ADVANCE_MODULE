import java.sql.*;

public class PreparedStatementExample {
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";
    static final String SQL = "SELECT name FROM employees WHERE id = ?";

    public static void main(String[] args) {
        int employeeId = 102; // Simulating user input

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            
            // Set the parameter for the query
            pstmt.setInt(1, employeeId);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("name");
                    System.out.println("Employee found: " + name);
                } else {
                    System.out.println("No employee found with ID: " + employeeId);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
