package task7_8;

public class Test {
    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Book("little life", "hanya yanagihara", 2015);
        printables[1] = new Magazine(1999, "vogue");
        printables[2] = new Magazine(11, "газета");
        printables[3] = new Book("гъаъъ", "me", 2022);
        Magazine.printMagazines(printables);
        Book.printBooks(printables);
    }
}
