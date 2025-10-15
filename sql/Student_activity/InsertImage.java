import java.sql.*;
import java.io.*;

public class InsertImage {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/testdb", "root", "password");
        String sql = "INSERT INTO images (id, photo) VALUES (?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, 1);

        File file = new File("C:/Users/image1.jpg");
        FileInputStream fis = new FileInputStream(file);
        ps.setBinaryStream(2, fis, (int) file.length());
        ps.executeUpdate();
        System.out.println("Image inserted successfully.");
        con.close();
    }
}
