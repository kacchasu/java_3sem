package homework_6.task6_9;

public class Book implements Printable{
    int year;
    String name;

    public Book(int year, String name) {
        this.year = year;
        this.name = name;
    }


    @Override
    public void print() {
        System.out.println("Year: " + this.year + " \n Name: " + this.name);
    }
}
