package task3;

import java.util.Arrays;
public class Test {
    public static void merge(Student[] a, int left, int mid, int right){
        int it1 = 0;
        int it2 = 0;
        Student[] result = new Student[right - left];
        while(left + it1 < mid && mid + it2 < right){
            if(a[left + it1].compareTo(a[mid + it2]) < 0) {
                result[it1 + it2] = a[left + it1];
                it1++;
            }
            else{
                result[it1 + it2] = a[mid + it2];
                it2++;
            }
        }

        while (left + it1 < mid) {
            result[it1 + it2] = a[left + it1];
            it1++;
        }
        while (mid + it2 < right) {
            result[it1 + it2] = a[mid + it2];
            it2++;
        }

        System.arraycopy(result, 0, a, left, it1 + it2);
    }
    public static void mergeSort(Student[] a, int left, int right){
        if (left + 1 >= right)
            return;
        int mid = (left + right) / 2;
        mergeSort(a, left, mid);
        mergeSort(a, mid, right);
        merge(a, left, mid, right);
    }
    public static void main(String[] args) {
        Student[] IDNumber = new Student[10];
        for(int i = 0; i < 10; i++){
            IDNumber[i] = new Student((int) (Math.random() * 1000));
        }
        mergeSort(IDNumber, 0, 10);
        System.out.println(Arrays.toString(IDNumber));
    }
}
