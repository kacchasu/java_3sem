import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine().toLowerCase();
        Pattern pattern0 = Pattern.compile("[A-Za-z]");
        HashMap<String, Integer> dict = new HashMap<>(26);
        Matcher matcher = pattern0.matcher(text);
        while(matcher.find()) {
            if(dict.containsKey(matcher.group()))
                dict.put(matcher.group(), dict.get(matcher.group()) + 1);
            else
                dict.put(matcher.group(), 1);
        }
        System.out.println(dict);

    }
}
