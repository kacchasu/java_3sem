package ticket01;

public class Test {
    public int[] alternate(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        int resultIndex = 0;
        while (aIndex < a.length && bIndex < b.length) {
            if (a[aIndex] < b[bIndex]) {
                result[resultIndex] = a[aIndex];
                aIndex++;
            } else {
                result[resultIndex] = b[bIndex];
                bIndex++;
            }
            resultIndex++;
        }
        while (aIndex < a.length) {
            result[resultIndex] = a[aIndex];
            aIndex++;
            resultIndex++;
        }
        while (bIndex < b.length) {
            result[resultIndex] = b[bIndex];
            bIndex++;
            resultIndex++;
        }
        return result;
    }

    public static void main(String[] args) {
        Test test = new Test();
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8, 10 };
        int[] result = test.alternate(a, b);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
