package homework_8;

import com.company.Inp;

public class task5 {
    int sum(int n){
        if(n>0) {
            return (n%10 + sum(n / 10));
        }
        else{
            return n;
        }
    }

    public static void main(String[] args) {
        int x = Inp.integer();
        System.out.println(new task5().sum(x));
    }
}
