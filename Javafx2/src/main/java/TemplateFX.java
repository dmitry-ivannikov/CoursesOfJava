import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class TemplateFX extends Application {
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


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}




//    public static void main(String[] args) {launch(args);}
//
//
//@Override
//public void start(Stage primaryStage) {
//        javafx.scene.Group root = new javafx.scene.Group();
//        primaryStage.setScene(new Scene(root, 500, 300));
//        primaryStage.show();
//        }

