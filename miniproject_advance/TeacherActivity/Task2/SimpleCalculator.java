import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class SimpleCalculator extends Application {
    public void start(Stage stage) {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        Label result = new Label("Result");

        Button add = new Button("+");
        Button sub = new Button("-");
        Button mul = new Button("*");
        Button div = new Button("/");

        add.setOnAction(e -> result.setText("Sum: " + 
            (Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText()))));
        sub.setOnAction(e -> result.setText("Sub: " + 
            (Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText()))));
        mul.setOnAction(e -> result.setText("Mul: " + 
            (Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText()))));
        div.setOnAction(e -> result.setText("Div: " + 
            (Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText()))));

        HBox buttons = new HBox(10, add, sub, mul, div);
        VBox vbox = new VBox(10, tf1, tf2, buttons, result);

        Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("Simple Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
