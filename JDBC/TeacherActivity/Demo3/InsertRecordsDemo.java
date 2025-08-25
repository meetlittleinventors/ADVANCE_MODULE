import java.sql.*;

public class InsertRecordsDemo {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement st = con.createStatement()) {
            
            st.executeUpdate("INSERT INTO students VALUES(1,'Alice',85)");
            st.executeUpdate("INSERT INTO students VALUES(2,'Bob',78)");
            st.executeUpdate("INSERT INTO students VALUES(3,'Charlie',92)");
            
            System.out.println("Records Inserted Successfully!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
