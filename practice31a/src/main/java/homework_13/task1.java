package homework_13;

import com.company.Inp;

import java.util.Locale;

public class task1 {
    public static void main(String[] args) {
        String str = Inp.str();
        System.out.println(str.charAt(str.length())); // выводим последнгий  симвой
        System.out.println(str.endsWith("!!!")? "Строкa кончается на '!!!'": "Строкa yt кончается на '!!!'");
        System.out.println(str.startsWith("I like")? "Строкa кончается на 'I like'": "Строкa ne кончается на 'I like'");
        System.out.println(str.contains("Java")? "Строкa содержить джаву": "Строкa ne содержит дваву");
        if(str.contains("Java")) {
        int index = str.indexOf("java");
            System.out.println(index);
            System.out.println(str.substring(index));
        }
        str.replace('a', 'o');
        str.toUpperCase();
        System.out.println(str);
        str.toLowerCase(Locale.ROOT);
        System.out.println(str);
    }
}
