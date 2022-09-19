package task3;

public class Hotties implements Nameable {
    private String name;

    public Hotties(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
