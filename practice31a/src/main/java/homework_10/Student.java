package homework_10;


public class Student{
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


}
