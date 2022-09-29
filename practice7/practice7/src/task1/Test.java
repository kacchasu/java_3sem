package task1;

public class Test {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0,2,2);
        rectangle.moveDown(5.55);
        rectangle.moveRight(4.56);
        System.out.println(rectangle.toString());
    }
}
