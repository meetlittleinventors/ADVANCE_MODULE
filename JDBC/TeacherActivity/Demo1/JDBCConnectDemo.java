import java.sql.*;

public class JDBCConnectDemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load MySQL driver
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );
            System.out.println("Connection Successful!");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
