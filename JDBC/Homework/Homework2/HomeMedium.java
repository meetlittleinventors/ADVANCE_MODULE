import java.sql.*;

public class HomeMedium {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");
            Statement st = con.createStatement()) {
            
            // Create table
            st.executeUpdate("CREATE TABLE books (" +
                             "id INT PRIMARY KEY, " +
                             "title VARCHAR(50), " +
                             "price DOUBLE)");
            
            // Insert 3 records
            st.executeUpdate("INSERT INTO books VALUES(1,'Java Basics',500)");
            st.executeUpdate("INSERT INTO books VALUES(2,'Python Guide',450)");
            st.executeUpdate("INSERT INTO books VALUES(3,'Data Science',600)");
            
            System.out.println("Table created and records inserted!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
