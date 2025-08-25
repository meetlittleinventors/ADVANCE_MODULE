import java.io.*;
import java.net.*;

public class HomeworkClientHard {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        // Thread to read server messages
        new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println(msg);
                }
            } catch (IOException e) { e.printStackTrace(); }
        }).start();

        // Send messages
        String input;
        while ((input = br.readLine()) != null) {
            out.println(input);
        }
    }
}
