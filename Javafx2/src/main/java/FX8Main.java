import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;


    public class FX8Main extends Application {
        public static void main(String[] args){launch();}

        @Override
        public void start(Stage primaryStage) {
            FX8CustomControll fx8CustomControll = new FX8CustomControll();


            Group root = new Group();
            root.getChildren().addAll(fx8CustomControll);
            primaryStage.setScene(new Scene(root,500,400));
            primaryStage.show();
        }
    }

