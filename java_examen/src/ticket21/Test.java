package ticket21;

public class Test {
    public static void main(String[] args) {
        var values = new IntValue[20];
        for (int i = 0; i < 20; i++) {
            values[i] = new IntValue(i+1);
        }
        var value = new IntValue(17);
        System.out.println(SearchAlgorithms.linearSearch(values, value));
        System.out.println(SearchAlgorithms.binarySearch(values, value));
    }
}
