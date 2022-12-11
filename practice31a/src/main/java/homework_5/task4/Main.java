package homework_5.task4;

import javax.swing.*;

import static java.lang.Thread.sleep;

class Frame extends JFrame{
    public void start(){
        String path = "kek.gif";
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        ImageIcon gif = new ImageIcon(path);
        label.setIcon(gif);
        add(label);
        setSize(gif.getIconWidth(), gif.getIconHeight());
        setVisible(true);
    }

    public void start_2() throws InterruptedException { // 2 вариант
        int n = 3;
        ImageIcon ic[] = {new ImageIcon("gif_1.jpg"), new ImageIcon("gif_2.jpg"), new ImageIcon("gif_3.jpg")};
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        setSize(500,500);
        setVisible(true);
        int i = 0;
        while(true) {
            label.setIcon(ic[i]);
            add(label);
            if(i<n-1){
                i++;
            }
            else i=0;
            repaint();
            sleep(300);
        }
    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Frame().start_2();
    }
}
