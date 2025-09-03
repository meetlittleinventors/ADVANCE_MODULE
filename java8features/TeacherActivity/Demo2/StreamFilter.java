import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("Original list: " + numbers);

        // Filter the stream to keep only odd numbers
        List<Integer> oddNumbers = numbers.stream()
                                          .filter(n -> n % 2 != 0)
                                          .collect(Collectors.toList());

        System.out.println("List of odd numbers: " + oddNumbers);
    }
}
