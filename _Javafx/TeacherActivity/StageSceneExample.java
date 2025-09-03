import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StageSceneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the Scene Graph's root node
        Label label = new Label("Hello, JavaFX!");
        StackPane root = new StackPane();
        root.getChildren().add(label);

        // Create the Scene with the root node
        Scene scene = new Scene(root, 300, 200);

        // Set the Scene on the Stage
        primaryStage.setTitle("Stage and Scene");
        primaryStage.setScene(scene);
        
        // Show the Stage
        primaryStage.show();
    }
}
