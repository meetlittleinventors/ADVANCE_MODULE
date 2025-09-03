import java.io.*;
import java.net.*;

public class TwoClientServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        for (int i = 1; i <= 2; i++) {
            System.out.println("Waiting for client " + i);
            Socket s = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

            String msg = br.readLine();
            System.out.println("Client " + i + " says: " + msg);
            pw.println("Server received: " + msg);

            br.close();
            pw.close();
            s.close();
        }
        ss.close();
    }
}
