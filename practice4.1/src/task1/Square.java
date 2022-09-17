package task1;

public class Square extends Shape{
    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String getArea() {
        return "a * a";
    }

    @Override
    public String getPerimeter() {
        return "4 * a";
    }
}
