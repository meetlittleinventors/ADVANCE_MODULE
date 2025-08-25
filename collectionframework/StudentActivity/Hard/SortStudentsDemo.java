import java.util.*;
import java.util.stream.*;

public class SortStudentsDemo {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Rahul", 78);
        students.put("Neha", 92);
        students.put("Amit", 55);
        students.put("Priya", 85);

        students.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " - " + entry.getValue()));
    }
}
