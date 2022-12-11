package homework_9.task1;

import java.util.Collections;

public class task1 {
    public static void main(String[] args){
        Student[] st = {new Student(2, "Anton", 10),
        new Student(2, "Marina", 2),
                new Student(1, "Kirill", 4),
        new Student(3, "Anna", 19),
        new Student(3, "Alina", 7)};

        for(int i = 0; i< st.length; i++){
            int j = i-1;
            Student key = st[i];
            while((j>=0)  && (st[j].compareTo(key)>0) ){
                st[j+1]=st[j];
                j--;
            }
            st[j+1]=key;
        }
        for(int i=0; i< st.length; ++i){
            System.out.println(st[i].toString());
        }
    }
}
