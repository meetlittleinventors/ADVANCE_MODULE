import java.util.Optional;

public class OptionalUsage {
    public static void main(String[] args) {
        // Scenario 1: Optional with a value
        Optional<String> optionalWithValue = Optional.of("Hello, Java 8!");

        optionalWithValue.ifPresent(value -> System.out.println("Value present: " + value));
        System.out.println("Using orElse with a value: " + optionalWithValue.orElse("Default message"));

        System.out.println("---");

        // Scenario 2: Empty Optional
        Optional<String> optionalEmpty = Optional.empty();

        optionalEmpty.ifPresent(value -> System.out.println("Value present: " + value)); // Nothing will be printed
        System.out.println("Using orElse with an empty Optional: " + optionalEmpty.orElse("Default message"));
    }
}
