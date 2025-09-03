import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Comparator;

public class ListViewSortExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        ObservableList<String> items = FXCollections.observableArrayList(
            "Apple", "Kiwi", "Banana", "Strawberry", "Grape"
        );
        
        ListView<String> listView = new ListView<>(items);
        
        // Sort the items using a custom Comparator
        listView.getSortOrder().add(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println("Original list: " + items);
        System.out.println("Sorted list (by length): " + listView.getItems());
        
        // Setting up the scene and stage (not visible in console)
        StackPane root = new StackPane(listView);
        Scene scene = new Scene(root, 200, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ListView Sort");
        primaryStage.show();
    }
}
