import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * Created by dimas on 06.12.17.
 */
public class KeyStroke8 {

    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) throws Exception{

        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("Coming out");
        jPanel.add(jButton);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(keyStroke, "changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor",  myAction);


    }

    static class MyAction extends AbstractAction{

        MyAction(){
            putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
        }
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.blue);
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
