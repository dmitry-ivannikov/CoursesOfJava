import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;



public class FX15Media extends Application {
        public static void main(String[] args) {launch(args);}


        @Override
        public void start(Stage primaryStage) {

            javafx.scene.media.Media media = new javafx.scene.media.Media("file:///home/dimas/go.mp3");
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();


            javafx.scene.Group root = new javafx.scene.Group();
            primaryStage.setScene(new Scene(root, 500, 300));
            primaryStage.show();
        }

}
