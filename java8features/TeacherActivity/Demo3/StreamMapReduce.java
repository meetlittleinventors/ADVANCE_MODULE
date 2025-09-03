import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamMapReduce {
    public static void main(String[] args) {
        List<String> numberStrings = new ArrayList<>();
        numberStrings.add("10");
        numberStrings.add("20");
        numberStrings.add("30");

        System.out.println("Original list: " + numberStrings);

        // Use map to convert String to Integer, then reduce to sum them up
        Optional<Integer> sum = numberStrings.stream()
                                             .map(Integer::parseInt)
                                             .reduce((a, b) -> a + b);

        if (sum.isPresent()) {
            System.out.println("The sum of the numbers is: " + sum.get());
        } else {
            System.out.println("The list is empty.");
        }
    }
}
