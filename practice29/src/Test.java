public class Test {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager();
        Order order = new InternetOrder();
        order.add(new Drink("Coca-Cola", "Coca-Cola", 100));
        Order order2 = new InternetOrder();
        order2.add(new Drink("Coca-Cola", "Coca-Cola", 100));
        Order order3 = new InternetOrder();
        order3.add(new Dish("Pizza", "Pizza", 1000));
        orderManager.add("address1", order);
        orderManager.add("address2", order2);
        orderManager.add("address3", order3);
        System.out.println(orderManager.sameDishQuantity("Coca-Cola"));
        order2.add(new Dish("Pizza", "Pizza", -1));
        orderManager.add("address2", order2);
    }
}
