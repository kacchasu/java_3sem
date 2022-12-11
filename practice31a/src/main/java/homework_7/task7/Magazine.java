package homework_7.task7;

public class Magazine implements Printable{
    String name;
    int number;

    public Magazine(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public void print() {
        System.out.println("Magazine " + name + " number: " + number);
    }
}
