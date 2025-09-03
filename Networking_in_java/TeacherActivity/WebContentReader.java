import java.io.*;
import java.net.*;

public class WebContentReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com");
            System.out.println("Connecting to " + url.getHost());
            
            // Open a connection to the URL
            URLConnection connection = url.openConnection();
            
            // Get the input stream to read the content
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            
            System.out.println("Reading first 10 lines of HTML:");
            
            // Read and print the first 10 lines
            for (int i = 0; i < 10; i++) {
                String line = reader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            }
            
            reader.close();
        } catch (MalformedURLException e) {
            System.err.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("I/O error: " + e.getMessage());
        }
    }
}
