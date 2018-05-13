import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dimas on 07.12.17.
 */
public class Dialogs22 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);
        JButton jButton = new JButton("show diaolog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // JOptionPane.showMessageDialog(jPanel, "this is my dialog", "title", JOptionPane.ERROR_MESSAGE);
                // JOptionPane.showConfirmDialog(jPanel, "message");
               // JOptionPane.showOptionDialog(jPanel, "message", "title", 0, 0, null,new Object[]{"one", "two", "three"}, "bebe");
                System.out.println(JOptionPane.showInputDialog(jPanel, "nyanyanya"));
            }
        }); jPanel.revalidate();


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
