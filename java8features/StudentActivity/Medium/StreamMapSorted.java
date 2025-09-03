import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class StreamMapSorted {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 2, 8, 4);
        System.out.println("Original list: " + numbers);

        List<Integer> doubledAndSorted = numbers.stream()
                                                .map(n -> n * 2) // Double each number
                                                .sorted(Comparator.reverseOrder()) // Sort in descending order
                                                .collect(Collectors.toList());

        System.out.println("Doubled and sorted list (desc): " + doubledAndSorted);
    }
}
