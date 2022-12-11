package homework_6.task11;

import com.company.Main;

import java.util.Scanner;

public class main implements COnvertable{

    @Override
    public int convert(int x) {
        return(x+273);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsiy = sc.nextInt();
        System.out.println("Farengeyry: " + new main().convert(celsiy));
    }
}
