package homework_31;

import homework_29.*;

public class profiling {
    public static void create_object(){
        Dish dish1 = new Dish(1, "dish1", "desc1");
        Dish dish2 = new Dish(3, "dish2", "desc2");
        Dish dish3 = new Dish(3, "dish3", "desc3");
        Drink dish4 = new Drink(3, "drink1", "desc4");
        Drink dish5 = new Drink(3, "drink2", "desc5");

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
    }
    public static void main(String[] args) {
        for(int i=0; i<10000; i++){
            create_object();
        }
        System.out.println("test passed");
    }
}
