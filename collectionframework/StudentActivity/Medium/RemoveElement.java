import java.util.LinkedList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);

        System.out.println("Original list: " + numbers);

        // Remove all occurrences of the value 5
        numbers.removeIf(n -> n == 5);

        System.out.println("List after removing 5s: " + numbers);
    }
}
