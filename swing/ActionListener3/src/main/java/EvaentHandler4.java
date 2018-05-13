import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

/**
 * Created by dimas on 06.12.17.
 */
public class EvaentHandler4 {
    public static void main(String[] args) throws Exception{
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("sub");
        jPanel.add(jButton);
//        jButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                jFrame.setTitle(((JButton)e.getSource()).getText());
//            }
//        });

        jButton.addActionListener(EventHandler.create(ActionListener.class, jFrame, "title", "source.text"));

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
