package task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing{
    public TShirt(Sizes size, int cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("man tshirt dressed: size - %s, cost - %d, color - %s", size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("women tshirt dressed: size - %s, cost - %d, color - %s", size, cost, color);

    }
}
