import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClientV2 {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int port = 5003;
        try (Socket socket = new Socket(serverAddress, port);
             Scanner scanner = new Scanner(System.in);
             PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            
            System.out.println("Connected to server. Type messages to send. Type 'bye' to exit.");
            
            String userInput;
            while (true) {
                System.out.print("Client > ");
                userInput = scanner.nextLine();
                writer.println(userInput);
                
                String response = reader.readLine();
                System.out.println("Server > " + response);
                
                if (userInput.equalsIgnoreCase("bye")) {
                    break;
                }
            }
        } catch (IOException e) {
            System.err.println("Client error: " + e.getMessage());
        }
    }
}
