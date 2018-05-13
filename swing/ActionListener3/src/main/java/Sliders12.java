import javax.swing.*;
import java.awt.*;

/**
 * Created by dimas on 06.12.17.
 */
public class Sliders12 {
    static   JFrame jFrame = getFrame();
    static  JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);

        JSlider jSlider = new JSlider(JSlider.HORIZONTAL, 0, 100, 20);
        jPanel.add(jSlider);
        jSlider.setMinorTickSpacing(10);
        jSlider.setMajorTickSpacing(20);
        jSlider.setPaintTicks(true);
        jSlider.setSnapToTicks(true);
        jSlider.setPaintLabels(true);

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
