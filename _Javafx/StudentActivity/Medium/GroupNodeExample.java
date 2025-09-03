import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class GroupNodeExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create two Circle objects
        Circle circle1 = new Circle(50, 50, 20, Color.BLUE);
        Circle circle2 = new Circle(80, 50, 20, Color.RED);
        
        // Create a Group and add the circles to it
        Group group = new Group();
        group.getChildren().addAll(circle1, circle2);
        
        // Translate the entire group
        group.setTranslateX(100);
        group.setTranslateY(50);

        Scene scene = new Scene(group, 300, 200, Color.LIGHTGRAY);
        primaryStage.setTitle("Group Node Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
