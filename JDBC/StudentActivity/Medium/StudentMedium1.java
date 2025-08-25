import java.sql.*;

public class StudentMedium1 {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement st = con.createStatement()) {
            
            st.executeUpdate("INSERT INTO products VALUES(1,'Laptop',50000)");
            st.executeUpdate("INSERT INTO products VALUES(2,'Phone',20000)");
            st.executeUpdate("INSERT INTO products VALUES(3,'Tablet',15000)");
            st.executeUpdate("INSERT INTO products VALUES(4,'Monitor',10000)");
            st.executeUpdate("INSERT INTO products VALUES(5,'Keyboard',2000)");
            
            System.out.println("Products Inserted!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
