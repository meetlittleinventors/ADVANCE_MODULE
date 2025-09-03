import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;

public class OptionalExample {

    public static Optional<String> findName(List<String> names, String nameToFind) {
        for (String name : names) {
            if (name.equals(nameToFind)) {
                return Optional.of(name);
            }
        }
        return Optional.empty(); // Return an empty Optional if not found
    }

    public static void main(String[] args) {
        List<String> allNames = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));

        // Case 1: Name exists
        Optional<String> result1 = findName(allNames, "Bob");
        result1.ifPresent(name -> System.out.println("Found name: " + name));

        // Case 2: Name does not exist
        Optional<String> result2 = findName(allNames, "David");
        System.out.println("Name not found. Result: " + result2.orElse("Name not in list"));
    }
}
