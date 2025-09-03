import java.net.*;
import java.io.IOException;

public class UDPServer {
    public static void main(String[] args) {
        int port = 5001;
        try (DatagramSocket socket = new DatagramSocket(port)) {
            byte[] buffer = new byte[256];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("UDP Server listening on port " + port);

            // Wait to receive a packet
            socket.receive(packet);

            String receivedMessage = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Received from client: " + receivedMessage);

        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
