import javax.swing.*;
import java.awt.*;

/**
 * Created by dimas on 07.12.17.
 */
public class BorderGridLayout17 {
    static JFrame jFrame = getFrame();

    public static void main(String[] args) throws Exception{

        JPanel jPanel = new JPanel();
        jPanel.add(new JButton("one"));
        jPanel.add(new JButton("two"));
        jFrame.add( jPanel, BorderLayout.NORTH);
        jFrame.add(new JButton("NORTHone2"));
        jFrame.add(new JButton("west2"), BorderLayout.WEST);
        jFrame.add(new JButton("est3"), BorderLayout.EAST);
        jFrame.add(new JButton("south4"), BorderLayout.SOUTH);
        jFrame.add(new JButton("center5"), BorderLayout.CENTER);

//        JPanel jPanel = new JPanel();
//        jFrame.add(jPanel);
//        jPanel.setLayout(new GridLayout(2,2));
//        jPanel.add(new JButton("one"));
//        jPanel.add(new JButton("2"));
//        jPanel.add(new JButton("3"));
//        jPanel.add(new JButton("4"));






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
