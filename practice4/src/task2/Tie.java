package task2;

public class Tie extends Clothes implements MenClothing {
    @Override
    public void dressMan() {
        System.out.printf("tie dressed: size - %s, cost - %d, color - %s", size, cost, color);
    }

    public Tie(Sizes size, int cost, String color) {
        super(size, cost, color);
    }
}
