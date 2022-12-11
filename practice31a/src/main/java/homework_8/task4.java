package homework_8;

import com.company.Inp;

public class task4 {
    int sum(int k, int s, int x){
        if(x<=k*10){
            int temp = x;
            int summ=0;
            while(temp>0){
                summ+=temp%10;
                temp/=10;
            }
            if(summ==s){
                return(1+sum(k,s,x-1));
            }
            else{
                return(sum(k,s,x-1));
            }
        }
        else{
            return(0);
        }
    }
    public static void main(String[] args) {
        int s = Inp.integer();
        int k = Inp.integer();
        System.out.println(new task4().sum(s,k,k*10-1));
    }
}
