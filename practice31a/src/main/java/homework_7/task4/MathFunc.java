package homework_7.task4;

import com.company.Inp;

public class MathFunc implements MathCalculable{

    double ocr_len(double r){
            return(2*pi*r);
    }

    double square(int x){
        return (pow(x, 2));
    }

    @Override
    public int pow(int n, int x) {
        int y = 1;
        for(int i=0; i<n; i++){
            y=y*x;
        }
        return y;
    }

    @Override
    public double mod() {
        return 0;
    }

    public static void main(String[] args) {
        double r = Inp.doub();
        System.out.println(new MathFunc().ocr_len(r));
        int x = Inp.integer();
        System.out.println(new MathFunc().square(x));
    }
}
