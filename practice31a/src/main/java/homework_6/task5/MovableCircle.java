package homework_6.task5;


import java.awt.*;

public class MovableCircle extends Shape implements Movable {
    public MovableCircle(Color color, int posX, int posY) {
        super(color, posX, posY);
    }

    @Override
    public void move(int x, int y) {
        super.posX+=x;
        super.posY+=y;
    }

    @Override
    public void draw(Graphics g) {

    }
}
