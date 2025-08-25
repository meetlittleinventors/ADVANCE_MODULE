import java.util.*;

public class PhoneDirectoryDemo {
    public static void main(String[] args) {
        Map<String, String> contacts = new HashMap<>();
        contacts.put("Alice", "111");
        contacts.put("Bob", "222");
        contacts.put("Charlie", "333");

        System.out.println("Contacts: " + contacts);

        contacts.put("Bob", "999"); // update number
        System.out.println("Updated Contacts: " + contacts);
    }
}
