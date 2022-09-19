package task6_7_8;

public class Book implements Printable {
    private String title;
    private String author;
    private int year;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public void print() {
        System.out.println(title);
        System.out.println(author + ", " + year);
    }
}
