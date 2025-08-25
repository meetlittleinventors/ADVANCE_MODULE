import java.sql.*;

public class CreateTableDemo {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement st = con.createStatement()) {
            
            String sql = "CREATE TABLE students (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "marks INT)";
            st.executeUpdate(sql);
            System.out.println("Table Created Successfully!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
