import java.io.Serializable;

public final class Dish extends MenuItem implements Serializable {
    public Dish(String name, String description, int price) {
        super(name, description, price);
    }
}
