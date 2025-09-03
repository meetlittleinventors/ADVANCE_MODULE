import java.util.HashMap;
import java.util.Map;

public class StreamFilterMap {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();
        employees.put(101, "John Doe");
        employees.put(102, "Jane Smith");
        employees.put(103, "Bob Johnson");
        employees.put(104, "Janet Williams");

        System.out.println("Filtering employees whose name starts with 'J':");
        
        employees.entrySet().stream()
                 .filter(entry -> entry.getValue().startsWith("J"))
                 .forEach(entry -> System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue()));
    }
}
