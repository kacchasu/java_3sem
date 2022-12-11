package homework_30;

public class InternetOrdersManager implements OrdersManager{
    private QueueNode head = null;
    private QueueNode tail = null;
    private int size = 0;

    @Override
    public int itemsQuantity(String itemName) {
        int count = 0;
        QueueNode current = head;
        while (current != null) {
            count += current.value.itemQuantity(itemName); // складываем во всех заказах
            current = current.next;
        }
        return count;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        int count = 0;
        QueueNode current = head;
        while (current != null) {
            count += current.value.itemQuantity(item);
            current = current.next;
        }
        return count;
    }

    @Override
    public Order[] getOrders() {
        Order[] orders = new Order[size];
        QueueNode current = head;
        int i = 0;
        while (current != null) {
            orders[i] = current.value;
            i++;
            current = current.next;
        }
        return orders;
    }

    @Override
    public int ordersCostSummary() {
        int cost = 0;
        QueueNode current = head;
        while (current != null) {
            cost += current.value.costTotal();
            current = current.next;
        }
        return cost;
    }

    @Override
    public int ordersQuantity() {
        return size;
    }

    public boolean add(Order order) {
        if(head == null) {
            QueueNode node = new QueueNode();
            node.value = order;
            head = node;
            tail = node;
            size++;
            return true;
        }
        QueueNode node = new QueueNode();
        node.value = order;
        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
        return true;
    }

    public Order remove() {
        if(head == null)
            return null;
        QueueNode temp = head;
        head = head.next;
        head.prev = null;
        return temp.value;
    }

    public Order order() {
        if (head == null)
            return null;
        return head.value;
    }

    public void print() {
        QueueNode current = head;
        while (current != null) {
            current.value.print();
            current = current.next;
        }
    }
}
