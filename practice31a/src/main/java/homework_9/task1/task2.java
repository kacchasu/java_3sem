package homework_9.task1;

import java.util.Arrays;
import java.util.Collections;

public class task2 {
    public static void main(String[] args){
        Student[] st = {new Student(2, "Anton", 10),
                new Student(2, "Marina", 2),
                new Student(1, "Kirill", 4),
                new Student(3, "Anna", 19),
                new Student(3, "Alina", 7)};

        Arrays.sort(st);

        for(int i=0; i< st.length; ++i){
            System.out.println(st[i].toString());
        }
    }
}
