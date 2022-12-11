package homework_3.task1;


import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Anton", "anton34343@gmail.com", 'f');
        System.out.println("Информация об авторе: \n");
        System.out.println(author.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите email");
        String email= sc.nextLine();
        author.setEmail(email);
        System.out.println("Информация об авторе: \n");
        System.out.println(author.toString());
    }
}
