package task10;

import java.util.Scanner;

public class NumReverser {
    public static int func(int x){
        if (x / 10 == 0)
            return x;
        else
            return (x % 10) * (int) Math.pow(10, (int) Math.log10(x)) + func(x / 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number to reverse: ");
        int n = in.nextInt();
        System.out.println(func(n));
    }
}
