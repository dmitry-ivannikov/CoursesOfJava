import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * Created by dimas on 08.12.17.
 */
public class SpeedRendering8 {

    public static void main(String[] args){
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
            Ellipse2D ellipse2D = new Ellipse2D.Double(50,50,100,100);
            g2.draw(ellipse2D);

            RenderingHints renderingHints = new RenderingHints(null);
            renderingHints.put(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);
            g2.setRenderingHints(renderingHints);

            Ellipse2D ellipse2D1  = new Ellipse2D.Double(150,50,100,100);
            g2.draw(ellipse2D1);

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
