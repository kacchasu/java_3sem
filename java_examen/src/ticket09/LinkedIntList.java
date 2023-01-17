package ticket09;

public class LinkedIntList {
    private ListNode front;   // first value in the list

    // post: constructs an empty list
    public LinkedIntList() {
        front = null;
    }

    // post: returns a comma-separated, bracketed version of the list
    public String toString() {
        if (front == null) {
            return "[]";
        } else {
            StringBuilder result = new StringBuilder("[" + front.data);
            ListNode current = front.next;
            while (current != null) {
                result.append(", ").append(current.data);
                current = current.next;
            }
            result.append("]");
            return result.toString();
        }
    }

    // post: appends the given value to the end of the list
    public void add(int value) {
        if (front == null) {
            front = new ListNode(value);
        } else {
            ListNode current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new ListNode(value);
        }
    }

    public void removeDuplicates() {
        ListNode current = front;
        while (current != null) {
            ListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

}

