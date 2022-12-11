package homework_29;

public class Dish implements Item{
    int cost;
    String name;
    String description;

    public Dish(int cost, String name, String description) throws IllegalArgumentException{
        if (cost<0 || name.equals("") || description.equals("")) throw new IllegalArgumentException();
        this.cost = cost;
        this.name = name;
        this.description = description;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "cost=" + cost +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
