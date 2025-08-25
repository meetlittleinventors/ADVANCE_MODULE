import java.io.*;
import java.net.*;

public class HomeworkServerEasy {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server started. Waiting for client...");
        Socket s = ss.accept();
        System.out.println("Client connected.");

        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);

        String msg = br.readLine();
        System.out.println("Client says: " + msg);

        pw.println("Hello Client!");

        br.close();
        pw.close();
        s.close();
        ss.close();
    }
}
