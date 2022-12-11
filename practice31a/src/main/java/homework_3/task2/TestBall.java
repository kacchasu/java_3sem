package homework_3.task2;

import java.util.Scanner;

public class TestBall {
    public static void main(String[] args) {
        Ball b = new Ball();
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        b.move(x,y);
        System.out.println("Положение мяча: ");
        System.out.println(b.toString());
    }
}
