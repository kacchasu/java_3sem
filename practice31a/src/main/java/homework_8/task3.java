package homework_8;

import com.company.Inp;

public class task3 {
    void seq(int a, int b){
        if(a<b){
            System.out.println(a);
            seq(a+1, b);
        }
        else if (a>b){
            seq(b,a);
        }
        else{
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        int a = Inp.integer();
        int b = Inp.integer();
        new task3().seq(a,b);
    }
}
