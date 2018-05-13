import javafx.application.Application;
import javafx.concurrent.Worker;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

public class FX16Web extends Application {
        public static void main(String[] args) {launch(args);}


            @Override
            public void start(Stage primaryStage) {
                WebView webView = new WebView();
                final WebEngine webEngine = webView.getEngine();
                webEngine.loadContent("" +
                        "<div id='div'>Hellowww</div>"+
                        "<script>document.getElementById('div').style.color='blue';"+
                        "function changeColor(){document.getElementById('div').style.color='green'" +
                        "document.getElementById('div').innerHTML = myClass.getHello('Dimas')"+
                        "}</script>" +
                        "");

                JSObject jsObject = (JSObject) webEngine.executeScript("window");
                jsObject.setMember("myClass", new MyClass());
                webEngine.getLoadWorker()
                        .stateProperty()
                        .addListener( (obs, oldValue, newValue ) -> {
                            if (newValue == Worker.State.SUCCEEDED){
                                webEngine.executeScript("changeColor();");

                            }
                        });




                javafx.scene.Group root = new javafx.scene.Group();
                root.getChildren().addAll(webView);
                root.getChildren().addAll();
                primaryStage.setScene(new Scene(root, 500, 300));
                primaryStage.show();
        }

        public class MyClass{
            public String getHello(String name){
                return "hello" + name;
            }
        }
}
