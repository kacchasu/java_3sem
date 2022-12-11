package homework_8;

import java.sql.SQLOutput;
import java.util.Scanner;

public class task2 {
    void seq(int i, int n){
        if(i<=n){
            System.out.println(i);
            seq(i+1,n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new task2().seq(1, sc.nextInt());
    }
}
