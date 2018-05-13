import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dimas on 06.12.17.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        JFrame jFrame = getFrame();
        final JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("submiy");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.blue);
            }
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
