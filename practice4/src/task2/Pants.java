package task2;

public class Pants extends Clothes implements MenClothing, WomenClothing{
    @Override
    public void dressMan() {
        System.out.printf("man pants dressed: size - %s, cost - %d, color - %s", size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("women pants dressed: size - %s, cost - %d, color - %s", size, cost, color);
    }

    public Pants(Sizes size, int cost, String color) {
        super(size, cost, color);
    }
}
