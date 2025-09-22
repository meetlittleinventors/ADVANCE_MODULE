// Server Code (ChatServer.java)
import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static Set<ClientHandler> clientHandlers = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("Server started on port 5000...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("New client connected: " + socket.getInetAddress());
            ClientHandler handler = new ClientHandler(socket);
            clientHandlers.add(handler);
            new Thread(handler).start();
        }
    }

    static void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clientHandlers) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
    }

    static void removeClient(ClientHandler client) {
        clientHandlers.remove(client);
    }
}

class ClientHandler implements Runnable {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private String name;

    public ClientHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            out.println("Enter your name:");
            name = in.readLine();
            ChatServer.broadcastMessage(name + " joined the chat!", this);

            String message;
            while ((message = in.readLine()) != null) {
                if (message.equalsIgnoreCase("/quit")) break;
                ChatServer.broadcastMessage(name + ": " + message, this);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException ignored) {}
            ChatServer.removeClient(this);
            ChatServer.broadcastMessage(name + " left the chat.", this);
        }
    }

    void sendMessage(String message) {
        out.println(message);
    }
}


// Client Code (ChatClient.java)
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 5000;

        try (Socket socket = new Socket(host, port);
             BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
             Scanner scanner = new Scanner(System.in)) {

            // Thread to read messages from server
            new Thread(() -> {
                String msg;
                try {
                    while ((msg = in.readLine()) != null) {
                        System.out.println(msg);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Main thread sends messages
            while (true) {
                String message = scanner.nextLine();
                out.println(message);
                if (message.equalsIgnoreCase("/quit")) break;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
