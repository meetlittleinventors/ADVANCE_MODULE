import java.net.ServerSocket;
import java.io.IOException;

public class PortChecker {
    public static void main(String[] args) {
        int port = 80; // A common port for HTTP

        try (ServerSocket socket = new ServerSocket(port)) {
            System.out.println("Port " + port + " is available.");
        } catch (IOException e) {
            System.out.println("Port " + port + " is already in use.");
        }
    }
}
