import java.sql.*;

public class BatchInsert {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "password");
        Statement stmt = con.createStatement();
        stmt.addBatch("INSERT INTO logentries VALUES (1, 'Login')");
        stmt.addBatch("INSERT INTO logentries VALUES (2, 'Logout')");
        stmt.addBatch("INSERT INTO logentries VALUES (3, 'Purchase')");
        int[] result = stmt.executeBatch();
        System.out.println("Inserted " + result.length + " records.");
        con.close();
    }
}
