package homework_3.task10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] str_split = str.split(" ");
        System.out.println(str_split.length);
    }
}
