import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * Created by dimas on 07.12.17.
 */
public class FileDialog24 {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    public static void main(String[] args) throws Exception{
        jFrame.add(jPanel);
        JButton jButton = new JButton("show file dialog");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();



                //fileChooser.showOpenDialog(jPanel);
                //fileChooser.showSaveDialog(jPanel);
                //fileChooser.setMultiSelectionEnabled(true);
                //fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                //fileChooser.setCurrentDirectory(new File("."));

//                fileChooser.setFileFilter(new FileFilter() {
//                    @Override
//                    public boolean accept(File f) {
//                        if(f.getName().endsWith("gif")){
//                            return true;
//                        }return false;
//                    }
//
//                    @Override
//                    public String getDescription() {
//                        return "only gif files";
//                    }
//                });

//                final TextField textField = new TextField("sdfsd", 50);
//                fileChooser.add(textField);
//
//
//                fileChooser.addPropertyChangeListener(new PropertyChangeListener() {
//                    @Override
//                    public void propertyChange(PropertyChangeEvent evt) {
//                        textField.setText(evt.getNewValue().toString());
//                    }
//                });




                //fileChooser.setFileView();

                int i = fileChooser.showDialog(jPanel, "save as");
                System.out.println(i);

                File file =  fileChooser.getSelectedFile();
                System.out.println(file.getName());
            }
        });jPanel.revalidate();


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
