package learninig.com.events;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Created by AUrsu on 06-Dec-16.
 */
public class ButtonEvent extends Application {

    Label response;

    public static void main(String[] args) {

        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Demo");

        FlowPane rootNode = new FlowPane();

        Scene scene = new Scene(rootNode, 300, 200);
        primaryStage.setScene(scene);

        Button button = new Button("Start");

        response = new Label("this is the response");
        /*button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                response.setText("First button pressed");
            }
        });*/

        button.setOnAction(ae->response.setText("First button pressed"));

        rootNode.getChildren().addAll(button,response);

        primaryStage.show();
    }
}
