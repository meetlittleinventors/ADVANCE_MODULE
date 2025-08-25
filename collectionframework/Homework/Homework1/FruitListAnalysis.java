import java.util.*;
public class FruitListAnalysis {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Mango", "Banana");

        System.out.println("All Fruits: " + fruits);

        long bananaCount = fruits.stream().filter(f -> f.equals("Banana")).count();
        System.out.println("Banana appears: " + bananaCount + " times");
    }
}
