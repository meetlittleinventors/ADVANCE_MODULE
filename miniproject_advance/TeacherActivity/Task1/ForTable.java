import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Random;

public class CreativeButtonClicker extends Application {
    public void start(Stage stage) {
        Button btn = new Button("Click Me!");
        btn.setStyle("-fx-font-size: 16px; -fx-background-color: lightblue;");
        Random rand = new Random();

        btn.setOnAction(e -> {
            int r = rand.nextInt(256);
            int g = rand.nextInt(256);
            int b = rand.nextInt(256);
            btn.setStyle("-fx-background-color: rgb(" + r + "," + g + "," + b + "); -fx-font-size: 16px;");
            btn.setText("Clicked!");
        });

        VBox vbox = new VBox(20, btn);
        vbox.setStyle("-fx-padding: 50px;");
        Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("Creative Button Clicker");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
