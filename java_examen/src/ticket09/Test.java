package ticket09;

public class Test {
    public static void main(String[] args) {
        LinkedIntList test = new LinkedIntList();
        test.add(14);
        test.add(8);
        test.add(14);
        test.add(12);
        test.add(1);
        test.add(14);
        test.add(11);
        test.add(8);
        test.add(8);
        test.add(10);
        test.add(4);
        test.add(9);
        test.add(1);
        test.add(2);
        test.add(5);
        test.add(2);
        test.add(4);
        test.add(12);
        test.add(12);
        System.out.println(test);
        test.removeDuplicates();
        System.out.println(test);
    }
}
