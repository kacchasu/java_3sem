package task4;

public class PriceTest {
    public static void main(String[] args) {
        Priceable cola = new DietCola(100);
        Priceable cheesesticks = new CheeseSticks(149);
        System.out.printf("cola and cheese sticks cost: %d", cola.getPrice() + cheesesticks.getPrice());
    }
}
