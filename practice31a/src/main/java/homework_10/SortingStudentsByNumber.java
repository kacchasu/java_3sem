package homework_10;

import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByNumber {



    public static void main(String[] args) {
        Student[] st = {new Student(2, "Anton", 10),
                new Student(2, "Marina", 2),
                new Student(1, "Kirill", 4),
                new Student(3, "Anna", 19),
                new Student(3, "Alina", 7)};
    Arrays.sort(st, new StudentComparator());
    for (Student stud: st){
        System.out.println(stud.toString());
        }
    }
}
