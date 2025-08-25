import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        System.out.print("Enter message: ");
        String msg = br.readLine();
        pw.println(msg);

        String response = in.readLine();
        System.out.println("Server says: " + response);

        br.close();
        pw.close();
        in.close();
        s.close();
    }
}
