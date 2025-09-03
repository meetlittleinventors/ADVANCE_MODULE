import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Java is a programming language. Java is widely used.";
        Map<String, Integer> wordCounts = new HashMap<>();

        // Normalize text and split into words
        String[] words = text.toLowerCase().replaceAll("[.,]", "").split(" ");

        for (String word : words) {
            // Use getOrDefault to simplify logic
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word frequency map: " + wordCounts);
    }
}
