import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ActionEventExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Click Me!");
        
        // Use a lambda expression for event handling
        button.setOnAction(event -> {
            System.out.println("Button clicked!");
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(button);
        
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Action Event");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
