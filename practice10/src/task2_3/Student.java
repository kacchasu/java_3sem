package task2_3;

public class Student implements Comparable<Student> {
    private final Integer id;
    private final Double gpa;

    public Student(Integer id, Double gpa) {
        this.id = id;
        this.gpa = gpa;
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

    public Double getGpa() {
        return gpa;
    }

    public static void setArray(Student[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = new Student((int) (Math.random() * 1000), Math.random() * 5);
        }
    }
    public static void outArray(Student[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}