package homework_5.task2;

import java.awt.*;

public class Oval extends Shape{
    int height;
    int width;

    public Oval(Color color, int posX, int posY, int height, int width) {
        super(color, posX, posY);
        this.width=width;
        this.height=height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillOval(posX, posY, height, width);
    }
}
