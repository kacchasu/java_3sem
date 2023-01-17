package ticket27;

public class Test {
    public static void main(String[] args) {
        var list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list.size());
    }
}
