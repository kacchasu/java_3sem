package ticketUnknown;

public class Test {
    public static void main(String[] args) {
        var list = new LinkedIntList();
        list.add(18);
        list.add(4);
        list.add(27);
        list.add(9);
        list.add(54);
        list.add(5);
        list.add(63);
        System.out.println(list);
        list.firstLast();
        System.out.println(list);
    }
}
