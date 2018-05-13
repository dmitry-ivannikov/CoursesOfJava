import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FX13CSS extends Application {

    public static void main(String[] args) {launch();}


        @Override
        public void start(Stage primaryStage) {
            Application.setUserAgentStylesheet(getClass().getResource("src/FX13CSS.css").toExternalForm());
            Button button = new Button("test");

            javafx.scene.Group root = new javafx.scene.Group();
            root.getChildren().add(button);
            primaryStage.setScene(new Scene(root, 500, 300));
            primaryStage.show();
        }

}
