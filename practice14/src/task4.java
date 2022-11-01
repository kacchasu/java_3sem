import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        String right = "(1 + 8) – 9 / 4";
        String wrong = "6 / 5 – 2 * 9";
        Pattern pattern = Pattern.compile("\\d\\s*\\+");
        Matcher matcher1 = pattern.matcher(right);
        Matcher matcher2 = pattern.matcher(wrong);
        System.out.println(matcher1.find());
        System.out.println(matcher2.find());
    }
}
