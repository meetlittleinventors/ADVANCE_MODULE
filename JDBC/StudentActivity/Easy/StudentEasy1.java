import java.sql.*;

public class StudentEasy1 {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password"
            );
            System.out.println("Connected Successfully!");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
