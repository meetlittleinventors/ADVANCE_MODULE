import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class FXTeacherDemo extends Application {
    public void start(Stage stage) {
        Label lbl = new Label("Enter Username:");
        TextField tf = new TextField();
        Button btn = new Button("Login");
        Label output = new Label();

        btn.setOnAction(e -> output.setText("Hello, " + tf.getText()));

        VBox vbox = new VBox(10, lbl, tf, btn, output);
        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("Login Form Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
