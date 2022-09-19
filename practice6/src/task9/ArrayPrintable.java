package task9;

import task6_7_8.Book;
import task6_7_8.Printable;
import task6_7_8.Shop;

import java.util.ArrayList;

public class ArrayPrintable {
    public static void main(String[] args) {
        ArrayList<Printable> paper = new ArrayList<Printable>();

        Printable book1 = new Book("one", "oner", 1);
        Printable book2 = new Book("two", "doublelift", 2);
        Printable shop1 = new Shop(150, "shop1");
        Printable shop2 = new Shop(1530, "shop2");

        paper.add(book1);
        paper.add(book2);
        paper.add(shop2);
        paper.add(shop1);

        for (Printable pape : paper) {
            pape.print();
        }
    }
}
