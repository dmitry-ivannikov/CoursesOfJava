import javax.swing.*;
import java.awt.*;

/**
 * Created by dimas on 08.12.17.
 */
public class awtTemplate {
    public static void main(String[] args){
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;
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
