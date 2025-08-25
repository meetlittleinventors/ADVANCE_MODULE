import java.sql.*;

public class StudentMedium2 {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement st = con.createStatement()) {
            
            ResultSet rs = st.executeQuery("SELECT * FROM products WHERE price>1000");
            while(rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                                   ", Name: " + rs.getString("name") +
                                   ", Price: " + rs.getDouble("price"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
