import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CSSExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button button = new Button("Styled Button");
        button.setId("my-button"); // Assign an ID to the button
        
        StackPane root = new StackPane(button);
        Scene scene = new Scene(root, 300, 200);
        
        // Link the external CSS file to the scene
        scene.getStylesheets().add("file:style.css");

        primaryStage.setTitle("CSS Styling Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
