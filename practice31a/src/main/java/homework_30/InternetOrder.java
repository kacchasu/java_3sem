package homework_30;

import java.util.ArrayList;
import java.util.Comparator;

public class InternetOrder implements Order{
    private int size = 0;
    private ListNode head;
    private ListNode tail;
    private Customer customer;

    @Override
    public boolean add(MenuItem item) {
        if (size == 0) {
            size = 1;
            head = new ListNode();
            head.value = item;
            head.next = null;
            tail = head;
            return true;
        }
        ListNode node = new ListNode();
        node.value = item;
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    @Override
    public String[] itemsNames() {
        ArrayList<String> names = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            names.add(current.value.getName());
            current = current.next;
        }
        String[] ans = new String[0];
        ans = names.toArray(ans);
        return ans;
    }

    @Override
    public int itemsQuantity() {
        return size;
    }

    @Override
    public int itemQuantity(String itemName) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            if(current.value.getName().equals(itemName))
                count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public int itemQuantity(MenuItem itemName) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            if(current.value.getName().equals(itemName.getName()) && current.value.getCost() == itemName.getCost() && current.value.getDescription().equals(itemName.getDescription()))
                count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public MenuItem[] getItems() {
        MenuItem[] array = new MenuItem[size];
        int count = 0;
        ListNode current = head;
        while(current != null) {
            array[count] = current.value;
            count++;
            current = current.next;
        }
        return array;
    }

    @Override
    public boolean remove(String itemName) {
        if(head.value.getName().equals(itemName)) { // если удаляемый элемент в вершине
            head = head.next;
            size--;
            return true;
        }
        if(size == 1)
            return false;
        ListNode current = head;
        while (!current.next.value.getName().equals(itemName)) {
            current = current.next;
            if(current.next == null) // дошли до конца но не нашли элемент
                return false;
        }
        current.next = current.next.next;
        size--;
        return true;
    }

    @Override
    public boolean remove(MenuItem itemName) {
        if(head.value.equals(itemName)) {
            head = head.next;
            size--;
            return true;
        }
        if(size == 1)
            return false;
        ListNode current = head;
        while (!current.next.value.getName().equals(itemName)) {
            current = current.next;
            if(current.next == null)
                return false;
        }
        current.next = current.next.next;
        size--;
        return true;
    }

    @Override
    public int removeAll(String itemName) {
        int count = 0;
        for(;;) {
            ListNode current = head;
            if (head == null) {
                return count;
            }
            while(current != null) {
                if(current.value.getName().equals(itemName)) {
                    count++;
                    remove(itemName);
                    break;
                }
                current = current.next;
            }
            if(current == null)
                return count;
        }
    }

    @Override
    public int removeAll(MenuItem itemName) {
        int count = 0;
        for(;;) {
            ListNode current = head;
            if (head == null) {
                return count;
            }
            while(current != null) {
                if(current.equals(itemName)) {
                    count++;
                    remove(itemName);
                    break;
                }
                current = current.next;
            }
            if(current == null)
                return count;
        }
    }

    @Override
    public MenuItem[] sortedItemsByCostDesc() {
        ArrayList<MenuItem> items = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            items.add(current.value);
            current = current.next;
        }
        items.sort(new Comparator<MenuItem>() {
            @Override
            public int compare(MenuItem o1, MenuItem o2) {
                if (o1.getCost() > o2.getCost())
                    return 1;
                if(o1.getCost() < o2.getCost())
                    return -1;
                return 0;
            }
        });
        MenuItem[] arr = new MenuItem[size];
        arr = items.toArray(arr);
        return arr;
    }

    @Override
    public int costTotal() {
        int cost = 0;
        ListNode current = head;
        while (current != null) {
            cost += current.value.getCost();
            current = current.next;
        }
        return cost;
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
        ListNode current = head;
        while(current != null) {
            System.out.println(current.value.getName());
            current = current.next;
        }
    }
}
