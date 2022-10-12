package task2;

public class Student implements Comparable<Student> {
    private final Integer id;
    private final Double gpa;
    public Student(int id, double gpa) {
        this.id = id;
        this.gpa = gpa;
    }

    public Double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                '}' + "\n";
    }
}
