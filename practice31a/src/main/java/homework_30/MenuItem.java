package homework_30;


import java.util.Objects;

public class MenuItem {
    private int cost;
    private String name;
    private String description ;

    public MenuItem(int cost, String name, String description) {
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem item = (MenuItem) o;
        return cost == item.cost && name.equals(item.name) && description.equals(item.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cost, name, description);
    }
}
