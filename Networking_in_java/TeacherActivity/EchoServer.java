import java.io.*;
import java.net.*;

public class EchoServer {
    public static void main(String[] args) {
        int port = 5000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            // Wait for a client connection
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " + clientSocket.getInetAddress());

            // Open input stream to read from the client
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String message = reader.readLine();
            
            System.out.println("Message received from client: " + message);

        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }
}
// client code is in next echoclient file
