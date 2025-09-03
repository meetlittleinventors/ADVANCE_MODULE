import java.io.*;
import java.net.*;

public class FileReceiverServer {
    public static void main(String[] args) {
        int port = 5004;
        String fileName = "received_file.txt";

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server listening for file transfer on port " + port);

            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected. Receiving file...");

            // Get input stream from the client socket
            InputStream inputStream = clientSocket.getInputStream();
            
            // Create a FileOutputStream to write the received data
            try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }
            }

            System.out.println("File received and saved as " + fileName);
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
