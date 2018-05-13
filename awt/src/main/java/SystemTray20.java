import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Created by dimas on 10.12.17.
 */
public class SystemTray20 {
    public static void main(String[] args) throws IOException, URISyntaxException, AWTException{
        if(SystemTray.isSupported()){
            SystemTray tray = SystemTray.getSystemTray();
            Image image = new ImageIcon("128.png", "desc").getImage();
            PopupMenu popupMenu = new PopupMenu();

            MenuItem menuItem = new MenuItem("one");
            menuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("sout One");
                }
            });

            popupMenu.add(menuItem);
            popupMenu.add(new MenuItem("two"));
            popupMenu.add(new MenuItem("three"));

            tray.add(new TrayIcon(image, "tray description", popupMenu));
        }
    }
}
