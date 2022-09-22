package task2;

public class Skirt extends Clothes implements WomenClothing{
    @Override
    public void dressWomen() {
        System.out.printf("skirt dressed: size - %s, cost - %d, color - %s", size, cost, color);
    }

    public Skirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }
}
