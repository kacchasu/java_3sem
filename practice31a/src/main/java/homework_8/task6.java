package homework_8;

import com.company.Inp;

public class task6 {
    boolean basic(int x, int y){
        if(y>1) {
            return (x % y != 0) && basic(x, y - 1);
        }
        else{return(true);}
    }
    public static void main(String[] args) {
        int x = Inp.integer();
        if(new task6().basic(x, x-1) == true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
