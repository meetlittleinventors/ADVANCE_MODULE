import java.sql.*;

public class UpdateExample {
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";
    static final String SQL_UPDATE = "UPDATE employees SET name = ? WHERE id = ?";

    public static void main(String[] args) {
        String newName = "Jane Miller";
        int employeeId = 102;

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(SQL_UPDATE)) {
            
            pstmt.setString(1, newName);
            pstmt.setInt(2, employeeId);
            
            int rowsAffected = pstmt.executeUpdate();
            
            System.out.println(rowsAffected + " row(s) updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
