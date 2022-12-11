package com.company.vichmat;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class iterations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 1.5;
        double b = 3.96;
        double c = 1.5;
        double d = 3.96;
        double x = sc.nextDouble();
        double diff = 100;
        double f = x * x * x * a + b * x * x - c * x - d;
        double fdif = 4.5*x*x + 7.92*x -1.5;

        diff = Math.abs(x - f);
        BigDecimal bd = new BigDecimal(Double.toString(f));
        bd = bd.setScale(5, RoundingMode.HALF_EVEN);
        x = bd.doubleValue();
        BigDecimal bdif = new BigDecimal(Double.toString(fdif));
        bdif = bdif.setScale(5, RoundingMode.HALF_EVEN);
         double xdif = bdif.doubleValue();
        System.out.println(x);
        System.out.println(xdif);
    }
}
