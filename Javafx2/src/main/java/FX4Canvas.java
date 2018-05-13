import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.awt.*;

public class FX4Canvas extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Canvas canvas = new Canvas(400, 300);
        GraphicsContext context = canvas.getGraphicsContext2D();
        drSh(context);

        javafx.scene.Group root = new javafx.scene.Group();
        Scene scene = new Scene(root, 400, 300);
        root.getChildren().add(canvas);

        //primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drSh(GraphicsContext gc){
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40,10,10,40);
        gc.fillOval(10,60,30,30);
        gc.strokeOval(60,60,30,30);
    }
}
