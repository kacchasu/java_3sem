package task2;

public abstract class Clothes {
    protected Sizes size;
    protected int cost;
    protected String color;

    public Clothes(Sizes size, int cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }
}
