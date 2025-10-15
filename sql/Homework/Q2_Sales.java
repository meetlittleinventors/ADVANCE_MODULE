import java.sql.*;

public class Q2_Sales {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/schoolDB", "root", "your_password");
            Statement stmt = con.createStatement();

            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS sales (id INT PRIMARY KEY, product_name VARCHAR(100), category VARCHAR(50), amount DECIMAL(10,2))");
            stmt.executeUpdate("DELETE FROM sales");

            stmt.executeUpdate("INSERT INTO sales VALUES" +
                    "(1,'Laptop','Electronics',55000)," +
                    "(2,'Mouse','Electronics',800)," +
                    "(3,'Keyboard','Electronics',1500)," +
                    "(4,'T-shirt','Clothing',700)," +
                    "(5,'Jeans','Clothing',1200)," +
                    "(6,'Shoes','Footwear',1800)," +
                    "(7,'Socks','Footwear',300)," +
                    "(8,'Watch','Accessories',2000)");

            String query = "SELECT category, SUM(amount) AS total_sales " +
                           "FROM sales GROUP BY category HAVING SUM(amount) > 1000 " +
                           "ORDER BY total_sales DESC";

            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Category\tTotal Sales");
            System.out.println("---------------------------");
            while(rs.next()){
                System.out.println(rs.getString(1)+"\t"+rs.getDouble(2));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
