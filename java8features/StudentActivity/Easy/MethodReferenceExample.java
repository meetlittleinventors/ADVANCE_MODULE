import java.util.ArrayList;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> greetings = new ArrayList<>();
        greetings.add("Hi");
        greetings.add("Hello");
        greetings.add("Greetings");

        System.out.println("Printing using a method reference:");
        // The lambda `s -> System.out.println(s)` can be replaced
        // with the method reference `System.out::println`
        greetings.forEach(System.out::println);
    }
}
