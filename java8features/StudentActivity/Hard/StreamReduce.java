import java.util.Arrays;
import java.util.List;

public class StreamReduce {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "is", "awesome");

        // The reduce method takes an identity value and a BinaryOperator
        // The identity is the initial value of the reduction
        String sentence = words.stream()
                               .reduce("", (partialString, element) -> partialString + " " + element)
                               .trim(); // Trim leading space from the result

        System.out.println("Original words: " + words);
        System.out.println("The concatenated sentence is: '" + sentence + "'");
    }
}
