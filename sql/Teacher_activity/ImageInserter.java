import java.sql.*;
import java.io.*;

public class ImageInserter {
    public static void main(String[] args) throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        PreparedStatement ps = conn.prepareStatement("INSERT INTO images (id, photo) VALUES (?, ?)");
        ps.setInt(1, 1);
        FileInputStream fis = new FileInputStream("sample.jpg");
        ps.setBinaryStream(2, fis, (int)new File("sample.jpg").length());
        int result = ps.executeUpdate();
        System.out.println("Image Inserted: " + (result == 1));
        conn.close();
    }
}
