package homework_9.task1;

public class Student implements Comparable<Student>{
    int course;
    String name;
    int number;

    public Student(int course, String name, int number) {
        this.course = course;
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.number - o.number;
    }
}
