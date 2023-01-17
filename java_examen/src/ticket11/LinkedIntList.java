package ticketUnknown;

public class LinkedIntList {
    private ListNode front;

    public LinkedIntList() {
        front = null;
    }

    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            var current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void firstLast() {
        var current = front;
        while (current.next != null) {
            current = current.next;
        }
        current.next = front;
        front = front.next;
        current.next.next = null;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        var current = front;
        while (current != null) {
            sb.append(current.data);
            sb.append(" ");
            current = current.next;
        }
        return sb.toString();
    }
}
