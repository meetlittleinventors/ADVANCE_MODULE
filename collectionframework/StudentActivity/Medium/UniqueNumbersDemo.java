import java.util.*;

public class UniqueNumbersDemo {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30, 20, 10));

        System.out.println("Unique Numbers: " + numbers);

        int max = Collections.max(numbers);
        System.out.println("Maximum Number: " + max);
    }
}
