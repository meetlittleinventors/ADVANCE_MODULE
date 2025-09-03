import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Paul");
        names.add("George");
        names.add("Ringo");

        Iterator<String> iterator = names.iterator();
        System.out.println("Iterating through the list:");

        while (iterator.hasNext()) {
            String currentName = iterator.next();
            if (!iterator.hasNext()) {
                System.out.println("Last name: " + currentName);
            } else if (names.getFirst().equals(currentName)) {
                System.out.println("First name: " + currentName);
            } else {
                System.out.println("Name: " + currentName);
            }
        }
    }
}
