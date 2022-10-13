
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class task1 {
    public static void main(String[] args) throws InterruptedException {
        Calendar now = new GregorianCalendar();
        System.out.println("developer: marov");
        System.out.println("task accepted: " + now.getTime());

        Thread.sleep(1000);
        Date after = new Date();
        System.out.println("task completed: " + after);
    }
}
