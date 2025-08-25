import java.sql.*;

public class StudentEasy2 {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement st = con.createStatement()) {
            
            String sql = "CREATE TABLE products (" +
                         "id INT PRIMARY KEY," +
                         "name VARCHAR(50)," +
                         "price DOUBLE)";
            st.executeUpdate(sql);
            System.out.println("Products Table Created!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
