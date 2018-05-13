import javax.swing.*;
import java.awt.*;

/**
 * Created by dimas on 05.12.17.
 */
public class Main {
    public static void main(String[] args){
        //System.out.println("hello");
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500 , 300);
        jFrame.setTitle("Hello");


    }

}
