package homework_11;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;

public class task1 {
    static String made = "ноя 16 в 23:01:09 PM";
    static String name = "Alekperova";
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM d 'в' HH:mm:ss a" );
        String bebra = dateFormat.format(date);
        System.out.println(name);
        System.out.println(made);
        System.out.println(bebra);
    }
}
