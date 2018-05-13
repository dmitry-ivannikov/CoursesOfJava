import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by dimas on 06.12.17.
 */
public class MiuseListener9 {
    static JFrame jFrame = getFrame();


    public static void main(String[] args) throws Exception{
        final JComponent jComponent = new MyComponent();
        jFrame.add(jComponent);
        jFrame.addMouseMotionListener(new MouseAdapter() {


            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
                MyComponent.xCoord = e.getX();
                MyComponent.yCoord = e.getY();
                jComponent.repaint();
            }
        });
    }

    static class MyComponent extends JComponent{
        public static int xCoord;
        public static int yCoord;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            ((Graphics2D)g).drawString("Coordinates x: " + xCoord + " y: " + yCoord, 50, 50);
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame(){};
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(750, 250, 500, 500);
        jFrame.setVisible(true);
        return jFrame;
    }
}
