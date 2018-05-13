//package main.java;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.security.acl.Group;

public class Main extends Application{
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        javafx.scene.Group group = new javafx.scene.Group();
        Scene scene = new Scene(group, 400, 300);

        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
