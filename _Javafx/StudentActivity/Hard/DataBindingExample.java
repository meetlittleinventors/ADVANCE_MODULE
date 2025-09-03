import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DataBindingExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        Slider slider = new Slider(0, 100, 50);
        slider.setShowTickLabels(true);
        
        Label label = new Label("Slider Value: ");
        
        // Bind the label's text property to the slider's value property
        label.textProperty().bind(
            Bindings.concat("Slider Value: ", slider.valueProperty().asString("%.2f"))
        );

        VBox root = new VBox(20, slider, label);
        root.setPadding(new Insets(20));
        
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("Data Binding");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
