import java.io.*;
import java.net.*;

public class MultiThreadedServer {
    public static void main(String[] args) throws IOException {
        int port = 5000;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                // Accept client connection and create a new thread for it
                Socket clientSocket = serverSocket.accept();
                System.out.println("New client connected: " + clientSocket.getInetAddress());
                new ClientHandler(clientSocket).start();
            }
        }
    }
}

class ClientHandler extends Thread {
    private Socket clientSocket;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true)) {
            
            String message;
            while ((message = reader.readLine()) != null) {
                System.out.println("Received from " + clientSocket.getInetAddress() + ": " + message);
                writer.println("Message received: " + message);
                if ("exit".equalsIgnoreCase(message)) {
                    break;
                }
            }
            System.out.println("Client disconnected: " + clientSocket.getInetAddress());
        } catch (IOException e) {
            System.err.println("Error in client handler: " + e.getMessage());
        }
    }
}
