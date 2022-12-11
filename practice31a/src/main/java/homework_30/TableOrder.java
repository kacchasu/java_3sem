package homework_30;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TableOrder implements Order{
    private int size;
    private MenuItem[] items;
    private Customer customer;

    public TableOrder() {
        size = 0;
        items = new MenuItem[0];
    }

    @Override
    public boolean add(MenuItem item) { // добавляем
        MenuItem[] newMenuItem = new MenuItem[size+1];
        for(int i = 0; i < size; i++) {
            newMenuItem[i] = items[i];
        }
        newMenuItem[size] = item;
        size++;
        items = newMenuItem;
        return true;
    }

    @Override
    public String[] itemsNames() {
        String[] names = new String[size]; // массив названий
        for(int i = 0 ; i < size; i++)
            names[i] = items[i].getName();
        return names;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) { // поиск кол-ва по названию
        int count = 0;
        for(MenuItem item : items)
            if(item.getName().equals(itemName))
                count++;
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int count = 0;
        for(MenuItem item : items)
            if(item.equals(itemName))
                count++;
        return count;
    }

    @Override
    public MenuItem[] getItems() {
        return items;
    }

    @Override
    public boolean remove(String itemName) {
        int flag = -1;
        for(int i = 0; i < size; i++) {
            if (items[i].getName().equals(itemName)) {
                flag = i;
                break;
            }
        }
        if (flag == -1) // если элемент не найден
            return false;
        MenuItem[] temp = new MenuItem[size-1];
        int ind = 0;
        for(int i = 0; i < size;i++) {
            if (i != flag){
                temp[i] = items[i];
                ind++;
            }
        }
        size--;
        items = temp;
        return true;
    }

    @Override
    public boolean remove(MenuItem itemName) {
        int ind = -1;
        for(int i = 0; i < size; i++) {
            if (items[i].equals(itemName)) {
                ind = i;
                break;
            }
        }
        if (ind == -1)
            return false;
        MenuItem[] temp = new MenuItem[size-1];
        for(int i = 0; i < ind;i++) {
            temp[i] = items[i];
        }
        for(int i = ind+1; i < size; i++) {
            temp[i-1] = items[i];
        }
        size--;
        items = temp;
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for (MenuItem item : items)
            if(item.getName().equals(itemName))
                count++;
        MenuItem[] temp = new MenuItem[size-count];
        int curr = 0;
        for(int i = 0; i < size; i++) {
            if(!items[i].getName().equals(itemName)) {
                temp[curr] = items[i];
                curr++;
            }
        }
        size = size-count;
        items = temp;
        return count;
    }

    @Override
    public int removeAll(MenuItem itemName) {
        int count = 0;
        for (MenuItem item : items)
            if(item.equals(itemName)) count++;
        MenuItem[] arr = new MenuItem[size-count];
        int curr = 0;
        for(int i = 0; i < size; i++) {
            if(!(items[i].getName().equals(itemName.getName()) && items[i].getCost() == itemName.getCost() && items[i].getDescription().equals(itemName.getDescription()))) {
                arr[curr] = items[i];
                curr++;
            }
        }
        size = size-count;
        items = arr;
        return count;
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        ArrayList<MenuItem> arr = new ArrayList<>();
        Collections.addAll(arr, items);
        arr.sort(new Comparator<MenuItem>() {
            @Override
            public int compare(MenuItem o1, MenuItem o2) {
                if (o1.getCost() > o2.getCost())
                    return 1;
                if(o1.getCost() < o2.getCost())
                    return -1;
                return 0;
            }
        });

        MenuItem[] array = new MenuItem[size];
        array = arr.toArray(array);
        return array;
    }

    @Override
    public int costTotal() {
        int total = 0;
        for(MenuItem item : items)
            total += item.getCost();
        return total;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            System.out.println(items[i].getName());
        }
    }
}