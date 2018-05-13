import javax.swing.*;
import java.awt.*;

/**
 * Created by dimas on 07.12.17.
 */
public class ToolBar15 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception{
       jFrame.add(jPanel);

        JToolBar jToolBar = new JToolBar("Titile");
        JButton jButton = new JButton("one");
        jButton.setToolTipText("first");
        jToolBar.add(jButton);
        jToolBar.add(new JButton("two"));
        jToolBar.addSeparator();
        jToolBar.add(new JButton("three"));

        jPanel.add(jToolBar);
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
