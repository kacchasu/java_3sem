package homework_6.task5;

public class MovablePoint implements Movable{
    int x;
    int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x+=x;
        this.y+=y;
    }
}
