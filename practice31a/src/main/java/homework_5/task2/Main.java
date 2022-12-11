package homework_5.task2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

class Frame extends JFrame{
    public Frame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(300, 300);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int j = 1; j <= 5; j++) {
            for (int i = 1; i <= 4; i++) {
                Shape shape;
                Random rand = new Random();
                Color color = new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat());
                int height = (rand.nextInt(3) + 1) * 20;
                int width = (rand.nextInt(3) + 1) * 20;
                switch (new Random().nextInt(2)) {
                    case 0:
                        shape = new Oval(color, 100 * i, 100 * j, height, width);
                        break;
                    case 2:
                        shape = new Rect(color, 100 * i, 100*j, height, width);
                        break;
                    default:
                        shape = new Rect(color, 100 * i, 100*j, height, width);
                        break;
                }
                shape.draw(g);
            }
        }
    }
}

public class Main{
    public static void main(String[] args) {
        new Frame().setVisible(true);
    }
}
