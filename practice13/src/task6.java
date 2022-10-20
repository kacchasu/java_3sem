import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class task6 {

    public static StringBuilder getLine(String line){
        String[] words = line.split(" ");
        StringBuilder ans = new StringBuilder("");
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if (words[i].charAt(words[i].length() - 1) == words[j].charAt(0)) {
                    ans.insert(ans.length(), words[i] + " ");
                    ans.insert(ans.length(), words[j] + " ");
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        FileReader text = new FileReader("task6.txt");
        in.close();
        Scanner file = new Scanner(text);
        String line = file.nextLine();
        System.out.println(getLine(line));
    }
}
