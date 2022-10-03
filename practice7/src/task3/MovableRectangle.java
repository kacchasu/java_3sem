package task3;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;

    private MovablePoint bottomRight;

    public MovableRectangle() {
        topLeft = new MovablePoint(0,0);
        bottomRight = new MovablePoint(2, -2);
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    boolean SpeedTest() {return true;}
    @Override
    public void moveUp(double y) {
        topLeft.moveUp(y);
        bottomRight.moveUp(y);
    }

    @Override
    public void moveRight(double x) {
        topLeft.moveRight(x);
        bottomRight.moveRight(x);
    }

    @Override
    public void moveDown(double y) {
        topLeft.moveDown(y);
        bottomRight.moveDown(y);
    }

    @Override
    public void moveLeft(double x) {
        topLeft.moveLeft(x);
        bottomRight.moveLeft(x);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft.toString() +
                ", bottomRight=" + bottomRight.toString() +
                '}';
    }
}
