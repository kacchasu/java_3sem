package homework_3.task7;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book[] book = new Book[3];
        for(int i=0; i<3; i++){
            book[i] = new Book(sc.next(), sc.next(), sc.nextInt());
        }
        BookShelf bs = new BookShelf(3, book);
        bs.print();
        System.out.println("first: " + bs.first());
        System.out.println("last: " + bs.last());
        bs.sort();
        bs.print();
    }
}
