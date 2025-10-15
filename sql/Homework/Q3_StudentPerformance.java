import java.sql.*;

public class Q3_StudentPerformance {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolDB", "root", "your_password");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY, name VARCHAR(50), marks INT)");
            stmt.executeUpdate("DELETE FROM students");

            stmt.executeUpdate("INSERT INTO students VALUES" +
                    "(1,'Amit',45)," +
                    "(2,'Neha',88)," +
                    "(3,'Rohan',29)," +
                    "(4,'Simran',55)," +
                    "(5,'Karan',60)," +
                    "(6,'Meena',48)");

            // Increase marks for students scoring below 50
            stmt.executeUpdate("UPDATE students SET marks = marks + 5 WHERE marks < 50");

            // Delete students with marks < 30 after update
            stmt.executeUpdate("DELETE FROM students WHERE marks < 30");

            // Calculate average, max, min
            ResultSet rs = stmt.executeQuery(
                "SELECT AVG(marks) AS avg_marks, MAX(marks) AS max_marks, MIN(marks) AS min_marks FROM students");

            if(rs.next()){
                System.out.println("Average Marks: "+rs.getDouble("avg_marks"));
                System.out.println("Highest Marks: "+rs.getInt("max_marks"));
                System.out.println("Lowest Marks: "+rs.getInt("min_marks"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
