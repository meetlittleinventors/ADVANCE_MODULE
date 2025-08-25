import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FXStudentEasy2 extends Application {
    public void start(Stage stage) {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Button btn = new Button("Combine");
        Label lbl = new Label();

        btn.setOnAction(e -> lbl.setText(tf1.getText() + " " + tf2.getText()));

        VBox vbox = new VBox(10, tf1, tf2, btn, lbl);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("Easy Activity 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
