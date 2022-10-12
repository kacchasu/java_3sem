package task3;

public class Student implements Comparable<Student> {
    private final Integer id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                "}\n";
    }
}
