package homework_9.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task3 {
    Student[] mergeSort(Student[] a){
        if(a.length==1){
            return a;
        }
        Student[] l1 = new Student[a.length/2];
        for (int i=0; i< l1.length; i++){
            l1[i]=a[i];
        }
        Student[] l2 = new Student[a.length/2];
        for (int i=a.length/2+1; i< a.length; i++){
            l2[i-a.length/2-1]=a[i];
        }
        l1=mergeSort(l1);
        l2=mergeSort(l2);
        return merge(l1, l2);
    }
    Student[] merge(Student[] a, Student[]b){
        List<Student> res = new ArrayList<>();
        int j=0;
        ArrayList<Student> a1 = new ArrayList();
        ArrayList<Student> b1 = new ArrayList();
        for (Student elem: a){
            a1.add(elem);
        }
        for (Student elem: b){
            b1.add(elem);
        }
        while(a1.size()>0 && b1.size()>0){
            if(a1.get(0).compareTo(b1.get(0))>0){
                res.add(b1.get(0));
                b1.remove(0);
            }
            else{
                res.add(a1.get(0));
                a1.remove(0);
            }
        }
        while(a1.size()>0){
            res.add(a[0]);
            a1.remove(0);
        }
        while (b1.size()>0){
            res.add(b[0]);
            b1.remove(0);
        }
        Student[] result = new Student[res.size()];
        for(int i=0; i<res.size(); i++){
            result[i]= res.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Student[] st1 = {new Student(2, "Anton", 10),
                new Student(2, "Marina", 2),
                new Student(1, "Kirill", 4),
                new Student(3, "Anna", 19),
                new Student(3, "Alina", 7)};
        Student[] st2 = {new Student(2, "Anton", 15),
                new Student(2, "Sasha", 5),
                new Student(1, "Anton", 10),
                new Student(3, "Nastya", 21),
                new Student(3, "Anya", 6)};
        Student[] res = new task3().merge(st1, st2);
        Arrays.sort(res);
        for(Student stud: res){
            System.out.println(stud.toString());
        }
    }
}