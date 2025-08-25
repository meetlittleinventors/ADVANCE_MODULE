import java.util.*;
public class UniqueNumbersSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 10, 15, 10, 5, 20));

        System.out.println("Unique Numbers: " + numbers);

        int min = Collections.min(numbers);
        System.out.println("Minimum Number: " + min);
    }
}
