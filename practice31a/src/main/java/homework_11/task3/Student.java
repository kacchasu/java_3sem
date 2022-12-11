package homework_11.task3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    int course;
    String name;
    int number;
    Date birthdate;

    public Student(int course, String name, int number, Date date) {
        this.course = course;
        this.name = name;
        this.number = number;
        this.birthdate=date;
    }

    public String get_date(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d 'в' HH:mm:ss a" );
        String bebra = dateFormat.format(birthdate);
        return bebra;
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
