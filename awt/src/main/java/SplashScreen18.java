import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * Created by dimas on 09.12.17.
 */
public class SplashScreen18 {
    public static void main (String[] args) throws IOException, UnsupportedFlavorException, InterruptedException{
        SplashScreen splashScreen = SplashScreen.getSplashScreen();
        Rectangle bounds = splashScreen.getBounds();
        Graphics2D g2 = splashScreen.createGraphics();
        g2.setColor(Color.blue);
        for (int i = 0; i < 100; i++) {
            g2.fillRect(0,0,bounds.width * i / 100, 20);
            splashScreen.update();
            Thread.sleep(100);
        }


        final Image img = new ImageIcon(splashScreen.getImageURL()).getImage();
        final JFrame spplashFrame = new JFrame();

        final JPanel splashPanel;

    }
}
