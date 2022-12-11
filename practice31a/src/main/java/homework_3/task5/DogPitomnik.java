package homework_3.task5;

import java.util.Scanner;

public class DogPitomnik {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<3; i++){
            String a = sc.nextLine();
            System.out.println("name: ");
            String name = sc.nextLine();
            System.out.println("age: ");
            int age = sc.nextInt();
            Dog dog = new Dog(name, age);
            dogs[i]=dog;
        }
        for(int i=0; i<3; i++){
            System.out.println(dogs[i] + " :" + dogs[i].toHuman() + " человеческих лет");
        }
    }
}
