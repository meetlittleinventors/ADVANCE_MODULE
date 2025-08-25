import java.sql.*;

public class TransactionDemo {
    public static void main(String[] args) {
        try(Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb","root","password")) {
            
            con.setAutoCommit(false); // Start transaction
            Statement st = con.createStatement();
            
            st.executeUpdate("UPDATE students SET marks=90 WHERE id=2");
            st.executeUpdate("UPDATE students SET marks=95 WHERE id=3");
            
            con.commit(); // Commit changes
            System.out.println("Transaction Committed Successfully!");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
