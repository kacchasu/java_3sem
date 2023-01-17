package ticket07;

import java.util.LinkedList;

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

    public void removeAll(LinkedIntList secondList) {
        var secondNode = secondList.front;
        var current = front;
        ListNode prev = null;
        while (current != null) {
            if (current.data == secondNode.data) {
                if (current == front) {
                    front = front.next;
                } else {
                    prev.next = current.next;
                }
            }
            while (current.data > secondNode.data && secondNode.next != null) {
                secondNode = secondNode.next;
            }
            prev = current;
            current = current.next;
        }
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
