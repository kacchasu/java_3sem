package ticket07;

public class Test {
    public static void main(String[] args) {
        var list = new LinkedIntList();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }
        var list2 = new LinkedIntList();
        for (int i = 2; i <= 10; i+=2) {
            list2.add(i);
        }
        list.removeAll(list2);
        System.out.println(list);
    }
}
