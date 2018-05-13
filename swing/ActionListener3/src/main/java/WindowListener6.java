import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;

/**
 * Created by dimas on 06.12.17.
 */
public class WindowListener6 {
    public static void main(String[] args) throws Exception{
        JFrame jFrame = getFrame();
        jFrame.addWindowListener(new WindowAdapter() {
            // бебеббе)))))
        });

    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 300);
        jFrame.setVisible(true);
        return jFrame;
    }
}
