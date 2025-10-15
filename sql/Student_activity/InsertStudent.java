import java.sql.*;

public class InsertStudent {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "password");
        String sql = "INSERT INTO students (id, name) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 101);
        ps.setString(2, "Bob Smith");
        int rows = ps.executeUpdate();
        System.out.println(rows + " row inserted.");
        con.close();
    }
}
