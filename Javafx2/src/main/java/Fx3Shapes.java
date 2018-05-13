import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Fx3Shapes extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Line line = new Line(0,0,100,100);
        line.setStroke(Color.GREEN);

        javafx.scene.Group root = new javafx.scene.Group();
        Scene scene = new Scene(root, 400, 300);
        root.getChildren().add(line);

        //primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
