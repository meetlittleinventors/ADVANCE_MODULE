import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SceneGraphExample extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // HBox is a child of StackPane
        HBox hBox = new HBox(10, new Button("One"), new Button("Two"));
        StackPane root = new StackPane(hBox);
        
        Scene scene = new Scene(root, 250, 100);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Scene Graph Demo");
        primaryStage.show();
    }
}
