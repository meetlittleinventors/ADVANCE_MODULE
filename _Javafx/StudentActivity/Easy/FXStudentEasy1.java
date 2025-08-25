import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FXStudentEasy1 extends Application {
    public void start(Stage stage) {
        Label lbl = new Label("Click the button!");
        Button btn = new Button("Press Me");

        btn.setOnAction(e -> lbl.setText("Button Clicked!"));

        VBox vbox = new VBox(10, lbl, btn);
        Scene scene = new Scene(vbox, 250, 150);

        stage.setTitle("Easy Activity 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
