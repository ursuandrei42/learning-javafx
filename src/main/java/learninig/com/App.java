package learninig.com;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Hello world!
 *
 */
public class App extends Application {
    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Demo");

        FlowPane rootNode = new FlowPane();

        Scene scene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(scene);

        Label myLabel = new Label("A simple JavaFx Label");

        rootNode.getChildren().add(myLabel);

        primaryStage.show();
    }
}
