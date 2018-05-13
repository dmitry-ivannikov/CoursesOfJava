import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import javax.swing.border.Border;

public class FX6Layout extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
//        BorderPane borderPane = new BorderPane(); // север юг
//        borderPane.setCenter(new Button("press"));
//        borderPane.setMinWidth(200);
//        borderPane.setMinHeight(150);

        HBox hBox = new HBox(); //Один за другим в вектор до...
        // Vbox - колонка
        // grid - табличка
        //аflowPane, как hbox только с перебросом на новую строку
        //TilePain, как flow, только сетка с разцентровкой
        //AnchorPane - прибить элемент на метрво, даже при ресайзе не изменит своего значения

        hBox.getChildren().addAll(new Button("one"), new Button("two"));
        hBox.setSpacing(5); //между кнопки;
        hBox.setPadding(new Insets(5)); // от кроёв




        javafx.scene.Group root = new javafx.scene.Group();
        root.getChildren().addAll( hBox);
        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
