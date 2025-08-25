import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class QuizGameStarter extends Application {
    public void start(Stage stage) {
        Label question = new Label("What is 5 + 3?");
        Button opt1 = new Button("6");
        Button opt2 = new Button("8");
        Label result = new Label();

        opt1.setOnAction(e -> result.setText("Wrong!"));
        opt2.setOnAction(e -> result.setText("Correct!"));

        VBox vbox = new VBox(10, question, opt1, opt2, result);
        vbox.setStyle("-fx-padding: 20px;");
        Scene scene = new Scene(vbox, 300, 200);

        stage.setTitle("Quiz Game Starter");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
