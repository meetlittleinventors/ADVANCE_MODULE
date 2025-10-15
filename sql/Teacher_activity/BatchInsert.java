import java.sql.*;

public class BatchInsert {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        Statement stmt = conn.createStatement();
        stmt.addBatch("INSERT INTO logentries VALUES (1, 'Login')");
        stmt.addBatch("INSERT INTO logentries VALUES (2, 'Data Entry')");
        stmt.addBatch("INSERT INTO logentries VALUES (3, 'Logout')");
        int[] result = stmt.executeBatch();
        System.out.println("Rows affected: " + result.length);
        conn.close();
    }
}
