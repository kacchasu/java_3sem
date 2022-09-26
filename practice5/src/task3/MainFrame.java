package task3;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class MainFrame extends JFrame {

    private JLabel imgLabel;

    public MainFrame(String arg){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource(arg)), SwingConstants.CENTER);
        getContentPane().add(imgLabel);
    }


}