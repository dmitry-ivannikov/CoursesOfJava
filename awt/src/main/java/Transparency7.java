import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

/**
 * Created by dimas on 08.12.17.
 */
public class Transparency7 {
    public static void main(String[] args){
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent{
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D)g;

            Rectangle2D rectangle2D = new Rectangle2D.Double(50,50,100,100);
            Color color = new Color(1f,0f,0f, 0.5f);
            g2.setColor(color);
            g2.fill(rectangle2D);


            Rectangle2D rectangle2D3 = new Rectangle2D.Double(130,50,100,100);
            Color color3 = new Color(0f,0f,1f, 0.5f);
            g2.setColor(color3);


            g2.fill(rectangle2D3);


            Rectangle2D rectangle2D2 = new Rectangle2D.Double(90,90,100,100);
            Color color2 = new Color(0f,1f,0f, 0.5f);
            g2.setColor(color2);


            //g2.setComposite(AlphaComposite.DstIn);
            g2.fill(rectangle2D2);
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
