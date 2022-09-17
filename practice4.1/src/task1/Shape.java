package task1;

public abstract class Shape {
    public abstract String getType();
    public abstract String getArea();
    public abstract String getPerimeter();

    @Override
    public String toString() {
        return getType() + "\n" + getArea()
                + "\n" + getPerimeter();
    }
}
