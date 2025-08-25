import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FXStudentMedium1 extends Application {
    public void start(Stage stage) {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Label result = new Label();

        Button add = new Button("+");
        add.setOnAction(e -> result.setText(
            String.valueOf(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText()))
        ));

        VBox vbox = new VBox(10, tf1, tf2, add, result);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("Medium Activity 1");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
