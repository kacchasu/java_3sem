package task2;

import java.util.Arrays;

public class Test {
    public static int partition(Student[] a, int l, int r) {
        SortingStudentsByGPA comparator = new SortingStudentsByGPA();
        Student v = a[(l + r) / 2];
        int i = l;
        int j = r;
        while (i <= j) {
            while(comparator.compare(a[i], v) > 0)
                i++;
            while(comparator.compare(a[j], v) < 0)
                j--;
            if (i >= j)
                break;
            Student tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
        return j;
    }

    public static void quicksort(Student[] a, int l, int r) {
        if (l < r){
            int q = partition(a, l, r);
            quicksort(a, l, q);
            quicksort(a, q + 1, r);
        }
    }

    public static void main(String[] args) {
        Student[] IDNumber = new Student[10];
        for(int i = 0; i < 10; i++)
            IDNumber[i] = new Student((int) (Math.random() * 1000), Math.random() * 10);

        quicksort(IDNumber, 0, 9);

        System.out.println(Arrays.toString(IDNumber));
    }
}
