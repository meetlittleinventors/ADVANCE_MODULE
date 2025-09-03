import java.io.*;
import java.net.*;

public class SquareServer {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

        int num = Integer.parseInt(br.readLine());
        pw.println("Square: " + (num * num));

        br.close();
        pw.close();
        s.close();
        ss.close();
    }
}
