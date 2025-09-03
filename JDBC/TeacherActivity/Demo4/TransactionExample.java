import java.sql.*;

public class TransactionExample {
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            conn.setAutoCommit(false); // Start the transaction

            // Insert a new employee
            try (PreparedStatement pstmt1 = conn.prepareStatement("INSERT INTO employees (id, name) VALUES (?, ?)")) {
                pstmt1.setInt(1, 104);
                pstmt1.setString(2, "David Wilson");
                pstmt1.executeUpdate();
                System.out.println("First insert successful.");
            }

            // This insert will fail due to duplicate ID (104)
            try (PreparedStatement pstmt2 = conn.prepareStatement("INSERT INTO employees (id, name) VALUES (?, ?)")) {
                pstmt2.setInt(1, 104);
                pstmt2.setString(2, "Lisa White");
                pstmt2.executeUpdate();
                System.out.println("Second insert successful.");
            }
            
            conn.commit(); // Commit the transaction
            System.out.println("Transaction committed.");

        } catch (SQLException e) {
            // Rollback the transaction on failure
            System.err.println("Transaction failed. Rolling back...");
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Rollback successful.");
                }
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
