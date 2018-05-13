import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

/**
 * Created by dimas on 06.12.17.
 */
public class Radio_Border11 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);

        jPanel.add(new JCheckBox("check box"));
        JRadioButton radioButton1 = new JRadioButton("оне");
        JRadioButton radioButton2 = new JRadioButton("тву");
        radioButton2.setSelected(true);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        jPanel.add(radioButton1);
        jPanel.add(radioButton2);

        Border border = BorderFactory.createEtchedBorder();
        Border border1 = BorderFactory.createTitledBorder(border, "title");

        JComboBox<String> comboBox = new JComboBox<String>();
        comboBox.addItem("one");
        comboBox.addItem("two");
        comboBox.addItem("three");
        comboBox.addItem("for");
        jPanel.add(comboBox);
        jPanel.setBorder(border1);

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
