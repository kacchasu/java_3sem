package task2;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {

    public int compare(Student a, Student b) {
        return a.getGpa().compareTo(b.getGpa());
    }

}
