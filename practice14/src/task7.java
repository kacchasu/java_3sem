import java.util.Scanner;
import java.util.regex.Pattern;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text =  "F032_Password";
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
        && Pattern.matches("\\w*[a-z]+\\w*", text));
        text =  "TrySpy1";
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
                && Pattern.matches("\\w*[a-z]+\\w*", text));
        text =  "smart_pass";
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
                && Pattern.matches("\\w*[a-z]+\\w*", text));
        text =  "A007";
        System.out.println(Pattern.matches("\\w*[A-Z]+\\w*", text) && Pattern.matches("\\w*\\d+\\w*", text)
                && Pattern.matches("\\w*[a-z]+\\w*", text));

    }
}
