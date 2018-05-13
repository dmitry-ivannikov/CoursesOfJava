import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.security.acl.Group;

public class FX9EventHandling  extends Application{

    public static void main(String[] args) {launch();}

    @Override
    public void start(Stage primaryStage) {


        Button button = new Button("Press");
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("Action");
            }
        });


        javafx.scene.Group root = new javafx.scene.Group();

        root.getChildren().addAll(button);
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }
}
