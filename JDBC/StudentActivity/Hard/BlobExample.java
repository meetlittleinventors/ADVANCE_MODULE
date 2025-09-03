import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class BlobExample {
    static final String DB_URL = "jdbc:mysql://localhost/testdb";
    static final String USER = "your_username";
    static final String PASS = "your_password";

    public static void main(String[] args) {
        String sql = "INSERT INTO images (id, photo) VALUES (?, ?)";

        // Path to the image file to be inserted
        File imageFile = new File("src/logo.png"); // Replace with a valid path

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql);
             InputStream fis = new FileInputStream(imageFile)) {

            pstmt.setInt(1, 1);
            pstmt.setBlob(2, fis);

            int rowsAffected = pstmt.executeUpdate();
            System.out.println(rowsAffected + " row(s) inserted. Image data stored successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
