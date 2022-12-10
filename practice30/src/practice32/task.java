import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.*;

public class task {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MenuItem dish1 = new Dish("name1", "1 sht", 1);
        MenuItem dish2 = new Dish("name1", "2 sht", 2);
        MenuItem dish3 = new Dish("name3", "3 sht", 3);
        MenuItem dish4 = new Dish("name4", "4 sht", 4);
        MenuItem dish5 = new Dish("name5", "5 sht", 5);
        MenuItem drink1 = new Drink("drink1", "cola", 43, DrinkTypeEnum.COFFEE, 1);
        MenuItem drink2 = new Drink("drink2", "coke", 23, DrinkTypeEnum.WINE, 2);
        MenuItem drink3 = new Drink("drink3", "zero", 1, DrinkTypeEnum.COLA, 0.2);
        TableOrdersManager tm = new TableOrdersManager();
        TableOrder order1 = new TableOrder();
        TableOrder order2 = new TableOrder();
        order1.add(dish1);
        order1.add(dish2);
        order1.add(dish3);
        order1.add(dish4);
        order1.add(dish5);
        order2.add(drink1);
        order2.add(drink2);
        order2.add(drink3);
        tm.add(order1, 3);
        tm.add(order2, 5);

        InternetOrdersManager im = new InternetOrdersManager();
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
        InternetOrder io = new InternetOrder(customer);
        io.add(drink3);
        io.add(dish1);
        im.add(io);
        // создаем два потока
        // один из них записывает в файл
        // другой преобразует объекты в байты
        FileOutputStream outputStream = new FileOutputStream("save.ser"); // сериализация
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(im);
        objectOutputStream.writeObject(tm);

        //закрываем поток и освобождаем ресурсы

        objectOutputStream.close();
        System.out.println("internet order");
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        InternetOrdersManager internet = (InternetOrdersManager) objectInputStream.readObject();
        TableOrdersManager table = (TableOrdersManager) objectInputStream.readObject();
        internet.print();
        System.out.println("\ntable orders");
        table.getOrder(5).print();
        System.out.println();
        table.getOrder(3).print();
        System.out.println("\npositions have been deleted\n");
        table.getOrder(3).removeAll("name1");
        table.getOrder(3).print();
    }
}