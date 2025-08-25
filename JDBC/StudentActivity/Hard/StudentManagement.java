import java.sql.*;

public class StudentManagement {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password");
            Statement st = con.createStatement()) {
            
            // Create table
            st.executeUpdate("CREATE TABLE IF NOT EXISTS students (" +
                             "id INT PRIMARY KEY, " +
                             "name VARCHAR(50), " +
                             "marks INT)");
            
            // Insert 5 records
            st.executeUpdate("INSERT INTO students VALUES(1,'Alice',85)");
            st.executeUpdate("INSERT INTO students VALUES(2,'Bob',78)");
            st.executeUpdate("INSERT INTO students VALUES(3,'Charlie',92)");
            st.executeUpdate("INSERT INTO students VALUES(4,'David',66)");
            st.executeUpdate("INSERT INTO students VALUES(5,'Eva',88)");
            
            // Retrieve students with marks > 80
            ResultSet rs = st.executeQuery("SELECT * FROM students WHERE marks>80");
            System.out.println("Students with marks > 80:");
            while(rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getInt("marks"));
            }
            
            // Update marks
            st.executeUpdate("UPDATE students SET marks=95 WHERE id=2");
            
            // Delete a student
            st.executeUpdate("DELETE FROM students WHERE id=4");
            
            System.out.println("Student Management Operations Completed!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
