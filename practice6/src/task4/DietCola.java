package task4;

public class DietCola implements Priceable{
    private int price;

    public DietCola(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
