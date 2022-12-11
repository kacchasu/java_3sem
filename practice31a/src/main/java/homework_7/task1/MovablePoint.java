package homework_7.task1;

public class MovablePoint implements Movable{

    int x;
    int y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveLeft(int x) {
        this.x-=x;
    }

    @Override
    public void moveRight(int x) {
        this.x+=x;
    }

    @Override
    public void moveUp(int y) {
        this.y-=y;
    }

    @Override
    public void moveDown(int y) {
        this.y+=y;
    }
}
