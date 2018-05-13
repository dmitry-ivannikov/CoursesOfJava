import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dimas on 07.12.17.
 */
public class CustomDialog23 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);
        JButton jButton = new JButton("show dialog");

        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MyDialog myDialog = new MyDialog();
                myDialog.setVisible(true);
            }
        });

    }

    static class MyDialog extends JDialog{
        public MyDialog(){
            super(jFrame, "Title", true);
            add(new JTextField(), BorderLayout.NORTH);
            add(new JButton("Buton"), BorderLayout.SOUTH);
            setBounds(500, 500, 250,150);
        }
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
