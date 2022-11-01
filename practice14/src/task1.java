import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        Pattern pattern = Pattern.compile("\\s");
        String[] splitted = pattern.split(text);
        System.out.println(Arrays.toString(splitted));
    }
}
