package task11;

import java.util.Scanner;

public class amountOne {
    public static int func(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = in.nextInt();
        if (n == 1) return func() + 1;
        else if (n == 0) {
            System.out.print("enter number: ");
            int n2 = in.nextInt();
            if (n2 == 0) {
                System.out.print("amount of 1: ");
                return 0;
            }
            else if (n2 == 1) return func() + 1;
            else return func();
        }
        else return func();
    }

    public static void main(String[] args) {
        System.out.println(func());
    }
}
