import java.sql.*;

public class StudentInserter {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO students (id, name) VALUES (?, ?)");
        ps.setInt(1, 101);
        ps.setString(2, "Bob Smith");
        int result = ps.executeUpdate();
        System.out.println("Rows affected: " + result);
        conn.close();
    }
}
