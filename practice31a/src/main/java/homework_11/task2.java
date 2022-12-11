package homework_11;

import com.company.Inp;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class task2 {
    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(Inp.integer());
        date.setMonth(Inp.integer());
        date.setDate(Inp.integer());
        Date now = new Date();
        if(now.after(date)){
            System.out.println("Введенная дата была до текущего момента");
        }
        else if(now.before(date)){
            System.out.println("вы ввели дату которая будет после текущей");
        }
        else{
            System.out.println("вы ввели текущую дату");
        }
    }
}
