package homework_6.task4;

public class Car implements Priceable{
    private int price;

    public Car(int price) {
        this.price = price;
    }

    @Override
    public void getPrice() {
        System.out.println("Car's price: " + this.price);
    }
}
