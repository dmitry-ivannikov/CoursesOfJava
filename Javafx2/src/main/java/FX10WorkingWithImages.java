import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import static javafx.application.Application.launch;

public class FX10WorkingWithImages extends Application{
    public static void main(String[] args) {launch();}


    @Override
    public void start(Stage primaryStage) throws IOException {
        Image image = new Image(new FileInputStream("foto.jpg"));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(500);
        imageView.setFitHeight(300);

        PixelReader pixelReader = image.getPixelReader();
        for (int i = 0; i < image.getWidth(); i++) {
            for (int j = 0; j < image.getHeight(); j++) {
                Color color = pixelReader.getColor(i ,j);
            }
        }

        WritableImage writableImage = new WritableImage((int)image.getWidth(), (int)image.getHeight());
        PixelWriter pixelWriter = writableImage.getPixelWriter();
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {
                pixelWriter.setColor(j, i, Color.ALICEBLUE);
            }
        }

        ImageIO.write(SwingFXUtils.fromFXImage(writableImage, null), "png", new FileOutputStream("test.png"));

        javafx.scene.Group root = new javafx.scene.Group();
        root.getChildren().add(new ImageView(writableImage));
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
    }
}
