package homework_29;

import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<String, Order> orders = new HashMap<>();
    public void addOrder(String address, Order order) throws OrderAlreadyAddedException{
        if (orders.containsKey(address)) {
            throw new OrderAlreadyAddedException(address);
        }
        else{
            orders.put(address, order);
        }
    }
    public Order getOrder(String address) throws IllegalTableNumber{
        if(!orders.containsKey(address))
            throw new IllegalTableNumber(address);
        return orders.get(address);
    }

    public void remove(String address) throws IllegalTableNumber{
        if(!orders.containsKey(address))
            throw new IllegalTableNumber(address);
        orders.remove(address);
    }

    public void addItem(String address, Item item) throws IllegalTableNumber{
        if(!orders.containsKey(address))
            throw new IllegalTableNumber(address);
        orders.get(address).addItem(item);
    }

    public Order[] getAllOrders() {
        Order[] array = orders.values().toArray(new Order[0]);
        return array;
    }

    public int getSummaryCost() {
        Order[] array = getAllOrders();
        int cost = 0;
        for(Order x : array)
            cost += x.getFullCost();
        return cost;
    }

    public int getSummaryCountOf(String name) {
        Order[] array = getAllOrders();
        int count = 0;
        for(Order x : array)
            count += x.getNumbersByName(name);
        return count;
    }


}
