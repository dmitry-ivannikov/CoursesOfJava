

import javafx.application.Application;
import javafx.scene.Camera;
import javafx.scene.Node;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

import static javafx.application.Application.launch;


public class FX183D extends Application {

    private final double cameraModifier = 50.0;
    private final double cameraQuantity = 10.0;
        public static void main(String[] args) {launch(args);}
@Override
public void start(Stage primaryStage) {

    Camera camera = new PerspectiveCamera(true);
    camera.setFarClip(50000.0);
    camera.setTranslateZ(-1000);




            Cylinder cylinder = new Cylinder(50,100);
    PhongMaterial blueMaterial = new PhongMaterial();
    blueMaterial.setDiffuseColor(Color.DARKBLUE);
    blueMaterial.setSpecularColor(Color.BLUE);
    cylinder.setMaterial(blueMaterial);

    cylinder.setRotationAxis(Rotate.X_AXIS);
    cylinder.setRotate(45);





            javafx.scene.Group root = new javafx.scene.Group();
            root.getChildren().addAll(cylinder);
            Scene scene = new Scene(root, 400,300);
            scene.setFill(Color.BLACK);
            scene.setCamera(camera);


            scene.setOnMouseClicked(event -> {
                Node picked = event.getPickResult().getIntersectedNode();
                if(null != picked){
                    double scalar = 2;
                    if(picked.getScaleX() > 1)
                        scalar = 1;
                    picked.setScaleX(scalar);
                    picked.setScaleY(scalar);
                    picked.setScaleZ(scalar);
                }
            });

            scene.setOnKeyPressed(event -> {
                double change = cameraQuantity;
                if(event.isShiftDown()){change = cameraModifier;}
                KeyCode keyCode = event.getCode();
                if(keyCode == KeyCode.W){camera.setTranslateZ(camera.getTranslateZ() + change);}
                if(keyCode == KeyCode.S){camera.setTranslateZ(camera.getTranslateZ() - change);}
                if(keyCode == KeyCode.A){camera.setTranslateZ(camera.getTranslateX() - change);}
                if(keyCode == KeyCode.D){camera.setTranslateZ(camera.getTranslateX() + change);}
            });


            primaryStage.setScene(scene);

            primaryStage.show();
        }


}
