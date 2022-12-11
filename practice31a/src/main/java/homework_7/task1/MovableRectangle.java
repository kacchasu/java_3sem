package homework_7.task1;

public class MovableRectangle implements Movable{

    MovablePoint bottomRight;
    MovablePoint topLeft;

    public MovableRectangle(MovablePoint bottomRight, MovablePoint topLeft) {
        this.bottomRight = bottomRight;
        this.topLeft = topLeft;
    }

    @Override
    public void moveLeft(int x) {
        bottomRight.moveLeft(x);
        topLeft.moveLeft(x);
    }

    @Override
    public void moveRight(int x) {
        bottomRight.moveRight(x);
        topLeft.moveRight(x);
    }

    @Override
    public void moveUp(int y) {
        topLeft.moveUp(y);
        bottomRight.moveUp(y);
    }

    @Override
    public void moveDown(int y) {
        topLeft.moveDown(y);
        bottomRight.moveUp(y);
    }
}
