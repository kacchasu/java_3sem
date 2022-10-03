package task7;

import java.util.ArrayList;
import java.util.Scanner;

public class Components {
    public static ArrayList<Integer> factorisation(int x, ArrayList<Integer> factors){
        for(int i = 2; i <= Math.sqrt(x); i++) {
            if(x % i == 0) {
                factors.add(i);
                return factorisation(x / i, factors);
            }
        }
        if(x != 1) factors.add(x);
        return factors;
    }

    public static void main(String[] args) {
        ArrayList<Integer> factors = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("enter number: ");
        int n = in.nextInt();
        System.out.println("result of factorisation: ");
        System.out.println(factorisation(n, factors));
    }
}
