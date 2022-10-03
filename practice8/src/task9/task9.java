package task9;

import java.util.Scanner;

public class task9 {
    public static int howMany(int a, int b){
        if (a == 0)
            return b;
        else if (a == 1)
            return b + 1;
        else if (a > 1 && b == 0)
            return 0;
        else
            return howMany(a - 1, b - 1) + howMany(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = in.nextInt();
        System.out.println("enter b: ");
        int b = in.nextInt();
        System.out.print("amount of all possible sequences: ");
        System.out.println(howMany(a, b));

    }
}
