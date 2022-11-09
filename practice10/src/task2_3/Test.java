package task2_3;

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

        Student.setArray(IDNumber);
        mergeSort(IDNumber, 0, 10);
        Student.outArray(IDNumber);

        quicksort(IDNumber, 0, 9);
        Student.outArray(IDNumber);
    }
}