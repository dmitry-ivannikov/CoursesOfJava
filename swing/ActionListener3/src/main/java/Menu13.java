import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by dimas on 06.12.17.
 */
public class Menu13 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();


    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);

        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(new JMenuItem("one"));
        jPopupMenu.add(new JMenuItem("two"));
        jPanel.setComponentPopupMenu(jPopupMenu);


    JMenuBar jMenuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");
        jMenuBar.add(file);
        jMenuBar.add(edit);

        file.add(new JMenuItem("Open",'O'));
        JMenuItem save = file.add(new JMenuItem("Seve"));
        save.setEnabled(false);
        file.addSeparator();
        JMenuItem exit = file.add(new JMenuItem("Exit"));
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
         exit.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));



        edit.add(new JMenuItem("cut"));
        edit.add(new JMenuItem("copy"));
        JMenu options = (new JMenu("Options"));
        edit.add(options);
        options.add("one");
        options.add("two");

        edit.add(new JCheckBoxMenuItem("Check"));

        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem radioButtonMenuItem1 = new JRadioButtonMenuItem("Radio1");
        JRadioButtonMenuItem radioButtonMenuItem2 = new JRadioButtonMenuItem("Radio2");
        buttonGroup.add(radioButtonMenuItem1);
        buttonGroup.add(radioButtonMenuItem2);
        edit.add(radioButtonMenuItem1);
        edit.add(radioButtonMenuItem2);






        jFrame.setJMenuBar(jMenuBar);
        jFrame.revalidate();

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
