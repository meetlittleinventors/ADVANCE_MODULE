import java.net.*;
import java.io.IOException;

public class UDPClient {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1";
        int port = 5001;
        try (DatagramSocket socket = new DatagramSocket()) {
            String message = "UDP Test";
            byte[] buffer = message.getBytes();

            InetAddress address = InetAddress.getByName(serverAddress);
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, port);

            socket.send(packet);
            System.out.println("Packet sent to server.");
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
