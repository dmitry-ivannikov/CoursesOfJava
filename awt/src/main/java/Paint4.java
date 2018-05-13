import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;

/**
 * Created by dimas on 08.12.17.
 */
public class Paint4 {
    public static void main(String[] args){
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;


           // Ellipse2D ellipse2D = new Ellipse2D.Double(0, 0, 500, 300);
            Rectangle2D rectangle2D = new Rectangle2D.Double(0, 0, 500, 300);
            //g2.setPaint(Color.red);
            //g2.setPaint(new GradientPaint(new Point(0, 0), Color.red, new Point(200, 100), Color.yellow));

            try{g2.setPaint(new TexturePaint(ImageIO.read(new File("/home/dimas/Рабочий стол/128.png")), new Rectangle2D.Double(0,0, 50, 50)));
            }catch (IOException e){e.printStackTrace();}

            g2.fill(rectangle2D);

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
