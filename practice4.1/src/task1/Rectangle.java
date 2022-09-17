package task1;

public class Rectangle extends Shape {
    @Override
    public String getType() {
        return "rectangle";
    }

    @Override
    public String getArea() {
        return "s = a * b";
    }

    @Override
    public String getPerimeter() {
        return "(2 * (a + b))";
    }
}
