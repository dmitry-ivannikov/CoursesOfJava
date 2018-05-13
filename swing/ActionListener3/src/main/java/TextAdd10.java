import javax.swing.*;
import java.awt.*;

/**
 * Created by dimas on 06.12.17.
 */
public class TextAdd10 {
    static JFrame jFrame = getFrame();

    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);
        jPanel.add(new JLabel("this is lable"));
        jPanel.add(new JTextField("default text", 20));
        JTextField jTextField = new JTextField();
        jTextField.getText();
        jPanel.add(new JPasswordField(20));
        JTextArea jTextArea = new JTextArea(5, 20);
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);
        jPanel.revalidate();

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
