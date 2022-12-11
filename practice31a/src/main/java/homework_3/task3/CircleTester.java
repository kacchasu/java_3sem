package homework_3.task3;

import java.util.Scanner;

public class CircleTester {
    private int n;
    public static Circle[] circles;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        circles = new Circle[n];
        for(int i=0; i<n; i++){
            circles[i]= new Circle(new Point(sc.nextInt(), sc.nextInt()), sc.nextInt());
        }
        for(int i=0; i<n; i++){
            System.out.println("Длина окружности: ");
            System.out.println(circles[i].getLen());
        }
    }
}
