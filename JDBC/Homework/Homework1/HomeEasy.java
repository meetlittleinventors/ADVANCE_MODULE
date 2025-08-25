import java.sql.*;

public class HomeEasy {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password"
            );
            System.out.println("Connected successfully!");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
