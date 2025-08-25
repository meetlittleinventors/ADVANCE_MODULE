import java.io.*;
import java.util.*;

public class CapstoneCSVSummaryq {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("data.csv"))) {
            String line;
            int count = 0;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                sum += Integer.parseInt(parts[1]);
                count++;
            }
            double avg = (double) sum / count;
            System.out.println("Total Entries: " + count);
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
