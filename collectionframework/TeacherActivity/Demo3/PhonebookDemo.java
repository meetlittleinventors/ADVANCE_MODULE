import java.util.*;

public class PhonebookDemo {
    public static void main(String[] args) {
        Map<String, String> phonebook = new HashMap<>();
        phonebook.put("Alice", "1234567890");
        phonebook.put("Bob", "9876543210");
        phonebook.put("Alice", "1111111111"); // replaces old entry

        System.out.println("Phonebook: " + phonebook);
    }
}
