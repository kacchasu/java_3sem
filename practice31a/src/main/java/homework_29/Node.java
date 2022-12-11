package homework_29;

public class Node { // узел двухсвязного списка
    protected Item data;
    protected Node nextNode;
    protected Node prevNode;

    public Node(Item item) {
        data = item;
    }

    public Node(Item item, Node nextNode, Node prevNode) {
        data = item;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }
}