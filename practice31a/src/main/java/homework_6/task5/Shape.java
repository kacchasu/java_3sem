package homework_6.task5;

import java.awt.*;

public abstract class Shape {
    public Shape(Color color, int posX, int posY){
        this.posX=posX;
        this.posY=posY;
        this.color=color;
    }
    protected Color color;
    int posX;
    int posY;
    public abstract void draw(Graphics g);
}
