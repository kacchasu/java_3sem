package ticket18;

public class Test {
    public static void main(String[] args) {
        var list = new ArrayIntList(11);
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(-3);
        list.add(0);
        list.add(42);
        list.add(308);
        list.add(17);
        System.out.println(list.longestSortedSequence());
    }
}
