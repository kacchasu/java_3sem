package homework_30;

import java.util.Arrays;

public class Main {
    public static void main(){
        MenuItem dish1 = new Dish(3, "Стейк", "Описание1");
        MenuItem dish2 = new Dish(3, "Цезарь", "Описание2");
        MenuItem dish3 = new Dish(2, "Суп грибной", "Описание3");
        MenuItem dish4 = new Dish(3, "Плов", "Описание4");
        MenuItem dish5 = new Dish(4, "Пельмени", "Описание5");
        MenuItem drink1 = new Drink(1, "Липтон", "Описание6", 0, DrinkTypeEnum.GREEN_TEA);
        MenuItem drink2 = new Drink(4, "Вино красное", "Описание7", 0.15, DrinkTypeEnum.WINE);
        MenuItem drink3 = new Drink(9, "Святой источник", "Описание8", 0, DrinkTypeEnum.WATER);
        TableOrdersManager tm = new TableOrdersManager();
        tm.add(new TableOrder(), 3);
        tm.add(new TableOrder(), 5);
        tm.add(dish1, 3);
        tm.add(dish3, 3);
        tm.add(dish5, 3);
        tm.add(drink1, 3);
        tm.add(drink1, 3);

        tm.add(dish2, 5);
        tm.add(dish4, 5);
        tm.add(drink2, 5);
        System.out.println("table 3");
        tm.getOrder(3).print();
        System.out.println();
        System.out.println("table 5");
        System.out.println("Свободные столики");
        System.out.println(Arrays.toString(tm.freeTableNumbers()));
        tm.remove(3);
        System.out.println(Arrays.toString(tm.freeTableNumbers()));

        InternetOrdersManager im = new InternetOrdersManager();
        Address a =new Address("moscow", 32, "lenina", 32, 'a', 4);
        Customer c = new Customer("ivan", "ivanov", 20, a);
        InternetOrder io = new InternetOrder();
        io.add(drink3);
        io.add(dish1);
        im.add(io);
        System.out.println("\nИнтерент заказ");
        im.print();

    }
}
