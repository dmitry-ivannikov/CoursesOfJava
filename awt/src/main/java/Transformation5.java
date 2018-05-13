import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by dimas on 08.12.17.
 */
public class Transformation5 {
    public static void main(String[] args){
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;

            Rectangle2D rectangle2D = new Rectangle2D.Double(0, 0, 100, 100);

            //g2.scale(2,2);
            //g2.translate(50,50);
           //g2.shear(0.2,0.5);
            g2.rotate(1);

            g2.draw(rectangle2D);
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
