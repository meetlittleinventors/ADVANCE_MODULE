import java.sql.*;

public class BatchProcessingExample {
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement()) {

            // Add SQL statements to the batch
            stmt.addBatch("INSERT INTO log_entries (message) VALUES ('Application started')");
            stmt.addBatch("INSERT INTO log_entries (message) VALUES ('User logged in')");
            stmt.addBatch("INSERT INTO log_entries (message) VALUES ('Data processed')");

            // Execute the batch
            int[] rowsAffectedArray = stmt.executeBatch();

            int totalRows = 0;
            for (int rowsAffected : rowsAffectedArray) {
                totalRows += rowsAffected;
            }

            System.out.println(totalRows + " rows inserted in the batch.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
