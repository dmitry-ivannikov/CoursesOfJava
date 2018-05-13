import javax.swing.*;
import java.awt.*;

/**
 * Created by dimas on 07.12.17.
 */
public class GridBagLayout18 {
    static  JFrame jFrame = getFrame();
    static  JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);
        GridBagLayout gridBagLayout = new GridBagLayout();
        jPanel.setLayout(gridBagLayout);

        GridBagConstraints constraints1 = new GridBagConstraints();
        constraints1.weightx = 0;// распространяемся автоматом
        constraints1.weighty = 0;
        constraints1.gridx = 0;// рисуем от
        constraints1.gridy = 0;
        constraints1.gridheight = 2;// занять
        constraints1.gridwidth = 2;
        jPanel.add(new JTextArea(4, 20), constraints1);

        GridBagConstraints constraints2 = new GridBagConstraints();
        constraints2.weightx = 0;// распространяемся автоматом
        constraints2.weighty = 0;
        constraints2.gridx = 2;// рисуем от
        constraints2.gridy = 0;
        constraints2.gridheight = 1;// занять
        constraints2.gridwidth = 2;
        jPanel.add(new JButton("submit a very long name"), constraints2);


        GridBagConstraints constraints3 = new GridBagConstraints();
        constraints3.weightx = 0;// распространяемся автоматом
        constraints3.weighty = 0;
        constraints3.gridx = 2;// рисуем от
        constraints3.gridy = 1;
        constraints3.gridheight = 1;// занять
        constraints3.gridwidth = 1;
        jPanel.add(new JButton("submit a"), constraints3);

        GridBagConstraints constraints4 = new GridBagConstraints();
        constraints4.weightx = 0;// распространяемся автоматом
        constraints4.weighty = 0;
        constraints4.gridx = 3;// рисуем от
        constraints4.gridy = 1;
        constraints4.gridheight = 1;// занять
        constraints4.gridwidth = 1;
        jPanel.add(new JButton("submit a"), constraints4);

        jPanel.revalidate();




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
