import java.io.*;
import java.net.*;

public class StudentTCPServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server waiting...");
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.println("Client says: " + br.readLine());

        br.close();
        s.close();
        ss.close();
    }
}
