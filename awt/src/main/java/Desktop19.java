import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by dimas on 09.12.17.
 */
public class Desktop19 {
    public static void main(String[] args) throws IOException, URISyntaxException {
        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            for( Desktop.Action action : Desktop.Action.values()){
                System.out.println(action);
            }
//            if(desktop.isSupported(Desktop.Action.OPEN)){
//                desktop.open(new File("foto.jpg"));
//            }
//            if(desktop.isSupported(Desktop.Action.BROWSE)){
//                desktop.browse(new URI("https://www.yandex.ru/"));
//            }
        }
    }
}
