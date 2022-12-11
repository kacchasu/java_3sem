package homework_3.task3;

public class Circle {
    private Point center = new Point(0.0, 0.0);
    private double radius = 1.0;
    public Circle(Point p, double r){
        this.center = p;
        this.radius=r;
    }
    public double getLen(){
        return 2*3.14*radius;
    }
}
