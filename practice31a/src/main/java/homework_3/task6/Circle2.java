package homework_3.task6;

    public class Circle2 {
        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        private double x =0.0;
        private double y =0.0;
        private double radius = 1.0;
        public Circle2(double r){
            this.radius=r;
        }
        public void setXY(double x, double y){
            this.x=x;
            this.y=y;
    }
    public double square(){
            return 3.14*3.14*radius;
    }
    public double length(){
            return(2*3.14*radius);
    }
    public boolean more(Circle2 c){
            return(this.square()>c.square());
    }
}
