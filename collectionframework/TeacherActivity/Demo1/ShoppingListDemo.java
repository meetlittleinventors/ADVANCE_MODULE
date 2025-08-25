import java.util.*;

public class ShoppingListDemo {
    public static void main(String[] args) {
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Milk"); // duplicate allowed

        System.out.println("Shopping List: " + shoppingList);
    }
}
