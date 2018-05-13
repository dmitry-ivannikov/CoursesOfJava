import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

/**
 * Created by dimas on 08.12.17.
 */
public class Shapes1 {
    public static void main(String[] args){
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;

            Point2D point = new Point2D.Double(50,0);
            Point2D point2 = new Point2D.Double(100,50);

            Line2D line = new Line2D.Double(point, point2);
            g2.draw(line);

            Rectangle2D rectangle2D = new Rectangle2D.Double(100, 0, 100, 50);
            g2.draw(rectangle2D);

            Ellipse2D ellipse2D = new Ellipse2D.Double(300,0,100,50);
            g2.draw(ellipse2D);

            QuadCurve2D quadCurve2D = new QuadCurve2D.Double(400, 0, 425, 100, 450, 0);
            g2.draw(quadCurve2D);


            CubicCurve2D cubicCurve2D = new CubicCurve2D.Double(450,50,475,150,525,-50,550,50);
            g2.draw(cubicCurve2D);

            Arc2D arc2D = new Arc2D.Double(0,100,200,200,0,45, Arc2D.CHORD);
            g2.draw(arc2D);

            GeneralPath generalPath = new GeneralPath();
            generalPath.moveTo(100,100);
            generalPath.lineTo(200,100);
            generalPath.quadTo(250,200,300,100);
            generalPath.curveTo(325,200,375,0,400,100);
            g2.draw(generalPath);
        }
    }



    static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 700, 300);
        jFrame.setVisible(true);
        return jFrame;
    }
}
