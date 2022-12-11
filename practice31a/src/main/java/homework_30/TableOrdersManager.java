package homework_30;


import java.util.ArrayList;

public class TableOrdersManager implements OrdersManager{
    private Order[] orders;

    public TableOrdersManager() {
        orders = new Order[10];
    }

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        for(int i = 0; i < orders.length; i++) {
            if (orders[i] != null)
                count += orders[i].itemQuantity(itemName);
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        for(int i = 0; i < orders.length; i++) {
            if (orders[i] != null)
                count += orders[i].itemQuantity(item);
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        for(int i = 0; i < orders.length; i++)
            if(orders[i] != null)
                cost += orders[i].costTotal();
        return cost;
    }

    @Override
    public int ordersQuantity() {
        int count = 0;
        for(int i = 0; i < orders.length; i++)
            if(orders[i] != null)
                count++;
        return count;
    }

    public boolean add(Order order, int tableNumber) {
        if (orders[tableNumber] != null) {
            return false;
        }
        orders[tableNumber] = order;
        return true;
    }

    public boolean add(MenuItem item, int tableNumber) {
        if(orders[tableNumber] != null) {
            orders[tableNumber].add(item);
            return true;
        }
        return false;
    }

    public int freeTableNumber() {
        for(int i = 0; i < orders.length; i++) {
            if(orders[i] == null)
                return i;
        }
        return -1;
    }

    public int[] freeTableNumbers() {
        ArrayList<Integer> tables = new ArrayList<>();
        for(int i = 0; i < orders.length; i++) {
            if(orders[i] == null)
                tables.add(i);
        }

        int[] arr = new int[tables.size()];
        for(int i = 0; i < tables.size(); i++) {
            arr[i] = tables.get(i);
        }
        return arr;
    }

    public Order getOrder(int tableNumber) {
        return orders[tableNumber];
    }

    public void remove(int tableNumber) {
        orders[tableNumber] = null;
    }

    public int remove(Order order) {
        for(int i = 0 ; i < orders.length; i++)
            if(orders[i].equals(order)) {
                orders[i] = null;
                return i;
            }
        return -1;
    }

    public int removeAll(Order order) {
        int count = 0;
        for(int i = 0 ; i < orders.length; i++)
            if(orders[i].equals(order)) {
                orders[i] = null;
                count++;
            }
        return count;
    }

    public void print() {
        for(int i = 0; i < orders.length; i++) {
            if(orders[i] != null) {
                orders[i].print();
            }
        }
    }
}