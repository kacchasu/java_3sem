package task1;

public class Circle extends Shape {
    @Override
    public String getType() {
        return "circle";
    }

    @Override
    public String getArea() {
        return "s = pi * r^2";
    }

    @Override
    public String getPerimeter() {
        return "p = 2 * pi * r";
    }
}
