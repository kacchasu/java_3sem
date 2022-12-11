package homework_7.task5;

import com.company.Inp;

public class ProcessStrings implements StringEditor{
    String string;

    @Override
    public int sym() {
        return(string.length());
    }

    @Override
    public String odd() {
        String str = "";
        for(int i=1; i<string.length(); i+=2){
            str+=string.substring(i,i);
        }
        return str;
    }

    @Override
    public String reverse() {
        String str = "";
        for(int i=string.length()-1; i>=str.length(); i--){
            str+=string.charAt(i);
        }
        return str;
    }

    public ProcessStrings(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        StringEditor sb = new ProcessStrings(Inp.str());
        System.out.println(sb.odd());
        System.out.println(sb.sym());
        System.out.println(sb.reverse());
    }
}
