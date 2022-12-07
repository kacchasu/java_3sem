public class Test {
    public static void main(String[] args) {
        TableOrdersManager orderManager = new TableOrdersManager();
        InternetOrdersManager orderManager2 = new InternetOrdersManager();

        Customer customer;
        String firstName = "Ivan";
        String lastName = "Ivanov";
        int age = 20;
        String city = "Moscow";
        String street = "Lenina";
        int building = 1;
        int apartment = 1;
        int zipCode = 123456;
        char letter = 'A';
        Address address = new Address(city, street, building, apartment, zipCode, letter);
        customer = new Customer(firstName, lastName, address, age);
        Order order = new InternetOrder(customer);
        Order order1 = new TableOrder();
        Order order2 = new TableOrder();
        Order order3 = new InternetOrder(customer);
        order.add(new Drink("cola", "0.5", 100, DrinkTypeEnum.COLA, 0));
        order1.add(new Drink("cola", "0.5", 100, DrinkTypeEnum.COLA, 0));
        order2.add(new Drink("cola", "0.5", 100, DrinkTypeEnum.COLA, 0));
        order3.add(new Drink("cola", "0.5", 100, DrinkTypeEnum.COLA, 0));
        orderManager.add(order1, 1);
        orderManager.add(order2, 2);
        orderManager2.add(order2);
        orderManager2.add(order3);
        System.out.println(orderManager.itemsQuantity("cola"));
        System.out.println(orderManager2.itemsQuantity("cola"));
        System.out.println(orderManager.ordersQuantity());
        System.out.println(orderManager2.ordersQuantity());
        System.out.println(orderManager.ordersCostSummary());
        System.out.println(orderManager2.ordersCostSummary());
        System.out.println(orderManager.remove(0));
        System.out.println(orderManager2.remove());
        System.out.println(orderManager.ordersQuantity());
        System.out.println(orderManager2.ordersQuantity());
    }
}
