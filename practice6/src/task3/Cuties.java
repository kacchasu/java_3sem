package task3;

public class Cuties implements Nameable{
    private String name;

    public Cuties(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
