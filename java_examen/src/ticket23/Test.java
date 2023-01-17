package ticket23;

public class Test {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeEnum.CIRCLE, 5);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
        shape = ShapeFactory.getShape(ShapeEnum.SQUARE, 5);
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
