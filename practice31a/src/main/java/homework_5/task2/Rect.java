package homework_5.task2;

import java.awt.*;

public class Rect extends Shape{
    int height;
    int width;
    public Rect(Color color, int posX, int posY, int height, int width) {
        super(color, posX, posY);
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics g){
        g.setColor(this.color);
        g.fillRect(posX, posY, width, height);
    }
}
