package homework_3.task6;

import java.util.Scanner;

public class CircleTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle2 c1 = new Circle2(sc.nextInt());
        Circle2 c2 = new Circle2(sc.nextInt());
        System.out.println("Длина 1 и 2 окружности:"  + c1.length() + " " + c2.length());
        if(c1.more(c2)){
            System.out.println("1 окржность больше");
        }
        else
        {
            System.out.println("2 окржность больше");
        }
    }
}
