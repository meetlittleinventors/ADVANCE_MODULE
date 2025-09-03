import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LayoutPaneExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Example of a VBox
        VBox vBox = new VBox(10); // Spacing of 10
        vBox.setPadding(new Insets(10));
        vBox.getChildren().addAll(
            new Button("Option 1"),
            new Button("Option 2")
        );
        Scene vBoxScene = new Scene(vBox, 200, 150);

        // Example of a GridPane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10));
        gridPane.add(new Label("Name:"), 0, 0);
        gridPane.add(new TextField(), 1, 0);
        gridPane.add(new Label("Email:"), 0, 1);
        gridPane.add(new TextField(), 1, 1);
        Scene gridPaneScene = new Scene(gridPane);

        // Switch between scenes to show the different layouts
        primaryStage.setScene(gridPaneScene);
        primaryStage.setTitle("Layout Panes");
        primaryStage.show();
    }
}
