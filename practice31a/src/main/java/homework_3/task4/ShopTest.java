package homework_3.task4;

import java.util.Scanner;

public class ShopTest {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            shop.add(sc.nextInt(), sc.nextLine());
        }
        Computer c = shop.get(sc.nextLine());
        if(c!=null){
            System.out.println("Компьютер найден. Оперативная память: ");
            System.out.println(c.ram);
        }
    }
}
