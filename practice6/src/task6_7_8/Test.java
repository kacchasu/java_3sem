package task6_7_8;

public class Test {
    public static void main(String[] args) {
        Printable shop = new Shop(1420232, "azbuka vkusa");
        Printable book = new Book("here u are", "d jun", 2017);
        shop.print();
        book.print();
    }
}
