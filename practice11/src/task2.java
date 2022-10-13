import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) throws InterruptedException {
        Calendar input = new GregorianCalendar();
        Scanner in = new Scanner(System.in);
        System.out.println("enter year: ");
        input.set(Calendar.YEAR, in.nextInt());
        System.out.println("enter month: ");
        input.set(Calendar.MONTH, in.nextInt());
        System.out.println("enter day of month: ");
        input.set(Calendar.DAY_OF_MONTH, in.nextInt());
        System.out.println("enter hour: ");
        input.set(Calendar.HOUR_OF_DAY, in.nextInt());
        System.out.println("enter minutes: ");
        input.set(Calendar.MINUTE, in.nextInt());
        System.out.println("enter seconds: ");
        input.set(Calendar.SECOND, in.nextInt());

        Calendar now = new GregorianCalendar();

        System.out.println("system time larger than entered time: " + now.after(input));

    }
}
