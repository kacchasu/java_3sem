import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter expression: ");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[()]");
        Matcher matcher = pattern.matcher(text);
        int open = 0;
        while (matcher.find()) {
            String character = matcher.group();
            if (character.equals("(")) {
                open++;
            } else {
                open--;
            }
            if (open < 0) {
                System.out.println("Expression is not valid");
                return;
            }
        }
        if (open == 0) {
            System.out.println("Expression is valid");
        } else {
            System.out.println("Expression is not valid");
        }
    }
}
