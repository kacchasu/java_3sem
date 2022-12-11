package homework_29;

public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Dish(1, "Пельмени", "Описание1");
        Dish dish2 = new Dish(3, "Мясо по французски", "Описание2");
        Dish dish3 = new Dish(3, "Суп сырный", "Описание3");
        Drink dish4 = new Drink(3, "Вино красное", "Описание4");
        Drink dish5 = new Drink(3, "Лимонад натахтари", "Описание5");

        Item[] arr1 = {dish1};
        Item[] arr2 = {dish2};
        OrderManager orderManager = new OrderManager();
        RestaurantOrder restaurantOrder = new RestaurantOrder(arr1);
        InternetOrder internetOrder = new InternetOrder(arr2);
        try {
            orderManager.addOrder("1", restaurantOrder);
            orderManager.addOrder("2", internetOrder);
            orderManager.addOrder("3", restaurantOrder);
            orderManager.addOrder("3", restaurantOrder);
        } catch (OrderAlreadyAddedException exc) {
            System.out.println(exc.getMessage());
        }
        try {
            orderManager.addItem("1", dish3);
            orderManager.addItem("2", dish4);
            orderManager.addItem("3", dish2);
            orderManager.addItem("4", dish4);
            orderManager.addItem("2", dish1);
            orderManager.addItem("1", dish1);
        } catch (IllegalTableNumber ex) {
            System.out.println(ex.getMessage());
        }
        Order[] array = orderManager.getAllOrders();
        for(Order x : array) {
            x.print();
            System.out.println();
        }
    }
}
