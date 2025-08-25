import java.sql.*;

public class SelectDemo {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement st = con.createStatement()) {
            
            ResultSet rs = st.executeQuery("SELECT * FROM students");
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Marks: " + rs.getInt("marks"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
