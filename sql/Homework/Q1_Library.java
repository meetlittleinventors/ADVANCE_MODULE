import java.sql.*;

public class Q1_Library {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolDB", "root", "your_password");

            Statement stmt = con.createStatement();

            // Create tables
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS authors (author_id INT PRIMARY KEY, author_name VARCHAR(100))");
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS books (book_id INT PRIMARY KEY, title VARCHAR(150), price DECIMAL(10,2), author_id INT, FOREIGN KEY (author_id) REFERENCES authors(author_id))");

            // Clear old data
            stmt.executeUpdate("DELETE FROM books");
            stmt.executeUpdate("DELETE FROM authors");

            // Insert data
            stmt.executeUpdate("INSERT INTO authors VALUES (1,'J.K. Rowling'),(2,'Chetan Bhagat'),(3,'George Orwell')");
            stmt.executeUpdate("INSERT INTO books VALUES (101,'Harry Potter',500,1),(102,'Half Girlfriend',250,2),(103,'1984',300,3)");

            // JOIN query
            ResultSet rs = stmt.executeQuery(
                "SELECT b.title, a.author_name FROM books b JOIN authors a ON b.author_id=a.author_id");

            System.out.println("Title\t\t\tAuthor");
            System.out.println("----------------------------------");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t\t"+rs.getString(2));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
