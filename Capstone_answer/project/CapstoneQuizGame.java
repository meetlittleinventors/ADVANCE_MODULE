import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class CapstoneQuizGame extends Application {
    int score = 0;

    public void start(Stage stage) {
        Label question = new Label("What is 7 + 5?");
        Button opt1 = new Button("10");
        Button opt2 = new Button("12");
        Label feedback = new Label("Score: 0");

        opt1.setOnAction(e -> feedback.setText("Wrong! Score: " + score));
        opt2.setOnAction(e -> {
            score++;
            feedback.setText("Correct! Score: " + score);
        });

        VBox vbox = new VBox(10, question, opt1, opt2, feedback);
        vbox.setStyle("-fx-padding: 20px;");
        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("Capstone: Quiz Game");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
