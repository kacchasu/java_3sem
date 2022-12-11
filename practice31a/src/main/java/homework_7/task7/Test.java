package homework_7.task7;

public class Test {
    public static void main(String[] args) {
        Printable[] printable = {new Book("Anton", "AAA", 1987), new Book("Nastya", "KEK", 1726), new Magazine("KEKEKKE", 2878)};
        for (Printable pr: printable){
            pr.print();
        }
    }
}
