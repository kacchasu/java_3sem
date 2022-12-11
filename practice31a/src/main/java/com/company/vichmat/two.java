package com.company.vichmat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xi= sc.nextDouble();
        double fxi = sc.nextDouble();
        double fxidif = sc.nextDouble();
        double f = xi - (fxi/fxidif);
        BigDecimal bd = new BigDecimal(Double.toString(f));
        bd = bd.setScale(5, RoundingMode.HALF_EVEN);
        double x = bd.doubleValue();
        System.out.println(x);
    }
}
