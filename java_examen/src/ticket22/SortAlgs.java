package ticket22;

public class SortAlgs {
    public void BubbleSort(Comparable [] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    Comparable temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        SortAlgs test = new SortAlgs();
        Integer[] a = { 11, 3, 2, 93, 5, 6, 17, 8, 0, 100 };
        test.BubbleSort(a);
        for (Integer integer : a) {
            System.out.print(integer + " ");
        }
    }
}
