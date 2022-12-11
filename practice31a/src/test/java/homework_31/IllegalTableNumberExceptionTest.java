package homework_31;

import homework_29.*;
import org.junit.Test;

public class IllegalTableNumberExceptionTest{
    @Test(expected = IllegalTableNumber.class)
    public void test() throws IllegalTableNumber{
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
        orderManager.remove("\uD83D\uDE08");
    }
}
