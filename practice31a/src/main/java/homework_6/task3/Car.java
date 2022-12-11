package homework_6.task3;

public class Car implements Nameable{

    private String name;
    String power;
    int year;

    public Car(String name, String power, int year) {
        this.name = name;
        this.power = power;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }
}
