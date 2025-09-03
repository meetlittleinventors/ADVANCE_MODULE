import java.util.ArrayList;
import java.util.List;

public class ListIntersection {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        List<String> list2 = new ArrayList<>();
        list2.add("Banana");
        list2.add("Grape");
        list2.add("Apple");

        // Create a new list to store the common elements
        List<String> commonElements = new ArrayList<>(list1);

        // Retain only the elements that are also in list2
        commonElements.retainAll(list2);

        System.out.println("First list: " + list1);
        System.out.println("Second list: " + list2);
        System.out.println("Common elements: " + commonElements);
    }
}
