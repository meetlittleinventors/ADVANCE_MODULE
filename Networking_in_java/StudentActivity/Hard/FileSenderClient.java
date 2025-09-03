import java.io.*;
import java.net.*;

public class FileSenderClient {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int port = 5004;
        String filePath = "data_to_send.txt"; // Create this file with some content

        try (Socket socket = new Socket(serverAddress, port);
             OutputStream outputStream = socket.getOutputStream();
             FileInputStream fileInputStream = new FileInputStream(filePath)) {

            System.out.println("Connecting to server and sending file: " + filePath);

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File sent successfully.");
        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}
