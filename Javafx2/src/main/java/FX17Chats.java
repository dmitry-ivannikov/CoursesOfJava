import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class FX17Chats extends Application {
        public static void main(String[] args) {launch(args);}


@Override
public void start(Stage primaryStage) {

    ObservableList<PieChart.Data> data = FXCollections.observableArrayList(
            new PieChart.Data("Graprfruit", 13),
            new PieChart.Data("Orange", 25),
            new PieChart.Data("Plums", 10),
            new PieChart.Data("Pears", 22),
            new PieChart.Data("Apples", 30)

    );

    PieChart chart = new PieChart(data);
    chart.setTitle("products");


            javafx.scene.Group root = new javafx.scene.Group();
    root.getChildren().addAll(chart);
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.show();
        }
}
