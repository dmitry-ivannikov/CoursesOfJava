import javax.swing.*;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by dimas on 08.12.17.
 */
public class Ares2 {
    public static void main(String[] args){
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;

            Area area = new Area(new Rectangle2D.Double(0,0,100,100) );
            //area.add(new Area(new Ellipse2D.Double(50, 50, 150, 150)));
            //area.subtract(new Area(new Ellipse2D.Double(50, 50, 150, 150)));
            //area.intersect(new Area(new Ellipse2D.Double(50, 50, 150, 150)));
            area.exclusiveOr(new Area(new Ellipse2D.Double(50, 50, 150, 150)));
            g2.fill(area);
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
