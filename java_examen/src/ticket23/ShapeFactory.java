package ticket23;

public class ShapeFactory {
    public static Shape getShape(ShapeEnum type, double side) {
        switch (type) {
            case CIRCLE:
                return new Circle(side);
            case SQUARE:
                return new Square(side);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + type);
        }
    }
}
