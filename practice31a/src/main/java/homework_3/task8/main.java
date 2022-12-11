package homework_3.task8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=sc.next();
        }
//        for(int i=0; i<n/2; i++){
//            String temp = str[i];
//            str[i]=str[n-1];
//            str[n-i]=temp;
//        }
     Collections.reverse(Arrays.asList(str));
        System.out.println("Sorted: ");
        for(int i=0; i<n; i++){
            System.out.println(str[i]);
        }

    }
}
