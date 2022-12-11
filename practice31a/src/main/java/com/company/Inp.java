package com.company;

import java.util.Scanner;

public class Inp {
    private static Scanner sc = new Scanner(System.in);

    public static String str(){
         String inp = sc.next();
        return inp;
    }

    public static int integer(){
        int inp = sc.nextInt();
        return inp;
    }

    public static double doub(){
        double inp = sc.nextDouble();
        return inp;
    }

}
