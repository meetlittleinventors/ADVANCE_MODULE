import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Random;

public class FXStudentMedium2 extends Application {
    public void start(Stage stage) {
        Button btn = new Button("Change Color");
        Pane pane = new Pane();
        pane.setPrefSize(300, 200);

        Random rand = new Random();
        btn.setOnAction(e -> pane.setStyle(
            "-fx-background-color: rgb(" + rand.nextInt(256) + "," + rand.nextInt(256) + "," + rand.nextInt(256) + ");"
        ));

        VBox vbox = new VBox(btn, pane);
        Scene scene = new Scene(vbox, 300, 250);

        stage.setTitle("Medium Activity 2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
