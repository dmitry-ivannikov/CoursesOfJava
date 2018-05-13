import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by dimas on 05.12.17.
 */
public class Lesson {
    public static void main(String[] args){
//        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//        for (String s : fonts){
//            System.out.println(s);
//        }



        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());


    }

    static class MyComponent extends JComponent{
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Bitstream Charter", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("Hello", 20 ,30);
            Point2D p1 = new Point2D.Double(70,70);
            Point2D p2 = new Point2D.Double(300,100);
            Line2D line2D = new Line2D.Double(p1, p2);
            g2.draw(line2D);
            Ellipse2D le = new Ellipse2D.Double(70,70, 170, 170);
            g2.setPaint(Color.cyan);
            g2.draw(le);
            Rectangle2D r2 = new Rectangle2D.Double(70,70,170,170);
            g2.draw(r2);

            try{
                URL url = new URL("http://www.apicius.es/wp-content/uploads/2012/07/IMG-20120714-009211.jpg");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image, 220, 50, null);
            } catch (MalformedURLException e){
                e.printStackTrace();
            }
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
