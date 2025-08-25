import java.util.*;

public class FruitListDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Apple", "Mango");

        System.out.println("Fruits: " + fruits);

        long count = fruits.stream().filter(f -> f.equals("Apple")).count();
        System.out.println("Apple appears: " + count + " times");
    }
}
