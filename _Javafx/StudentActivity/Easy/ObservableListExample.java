import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class ObservableListExample {
    public static void main(String[] args) {
        ObservableList<String> fruits = FXCollections.observableArrayList();
        
        // Add an InvalidationListener
        fruits.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("The list has been invalidated. Current size: " + fruits.size());
            }
        });

        System.out.println("Adding 'Apple'...");
        fruits.add("Apple");
        
        System.out.println("Adding 'Banana'...");
        fruits.add("Banana");
        
        System.out.println("Removing 'Apple'...");
        fruits.remove("Apple");
    }
}
