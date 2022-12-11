package homework_29;

import java.util.ArrayList;
import java.util.Comparator;

public class RestaurantOrder implements Order {
    private List list;

    public RestaurantOrder(Item[] array) {
        list = new List();
        for(int i = 0 ; i < array.length; i++) {
            list.add(array[i]);
        }
    }
    public void print() {
        list.display();
    }
    public boolean addItem(Item item) {
        list.add(item);
        return true;
    }

    public boolean deleteItem(String name){
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
                return true;
            }
        }
        return false;
    }

    public int deleteAllItems(String name) {
        int count = 0;
        while (list.include(name)) {
            deleteItem(name);
            count++;
        }
        return count;
    }

    public int getItemNumbers() {
        return list.size();
    }

    public Item[] getItems() {
        Item[] items = new Item[list.size()];
        for(int i = 0; i < list.size(); i++)
            items[i] = list.get(i);
        return items;
    }

    public int getFullCost() {
        int cost = 0;
        for(int i = 0; i < list.size(); i++) {
            cost += list.get(i).getCost();
        }
        return cost;
    }

    public int getNumbersByName(String name) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name))
                count++;
        }
        return count;
    }

    public String[] getAllNames() {
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(!names.contains(list.get(i).getName()))
                names.add(list.get(i).getName());
        }
        String[] arr = new String[names.size()];
        arr = names.toArray(arr);
        return arr;
    }
    public class CompareByCost implements Comparator<Item> {
        @Override
        public int compare(Item o1, Item o2) {
            if(o1.getCost() > o2.getCost())
                return -1;
            else if(o1.getCost() == o2.getCost())
                return 0;
            else
                return 1;
        }
    }

    public Item[] sort() {
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            items.add(list.get(i));
        }
        items.sort(new RestaurantOrder.CompareByCost());
        Item[] arr = new Item[items.size()];
        arr = items.toArray(arr);
        return arr;
    }
}
