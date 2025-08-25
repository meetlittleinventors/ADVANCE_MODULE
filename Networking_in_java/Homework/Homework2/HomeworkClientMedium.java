import java.io.*;
import java.net.*;

public class HomeworkClientMedium {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        pw.println("Hello from Client");
        System.out.println(in.readLine());

        pw.close();
        in.close();
        s.close();
    }
}
