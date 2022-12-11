package homework_5.task3;

import javax.swing.*;
import java.awt.*;

class Frame extends JFrame{
    public void start(String path){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon(path);
        setSize(img.getIconWidth(), img.getIconHeight());
        label.setIcon(img);
        add(label);
        setVisible(true);
    }
}


public class Main{
    public static void main(String[] args) {
        if(args.length>=1){
            new Frame().start(args[0]);
        }
        else{
            System.out.println("no args");
        }
    }
}
