import java.util.ArrayList;
import java.util.List;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("Printing names using forEach loop:");
        // The forEach method takes a Consumer functional interface
        names.forEach(name -> System.out.println(name));
    }
}
