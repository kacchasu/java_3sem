package task5;

public class Test implements Stringable{
    @Override
    public int char_counter(String str) {
        int i = 0;
        int cnt = 0;
        while (i != str.length() - 1) {
            if (str.charAt(i) != ' ') {
                cnt++;
            }
            i++;
        }
        return cnt;
    }

    @Override
    public String odd_positioner(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += str.charAt(i);
            ans += " ";
        }
        return ans;
    }

    @Override
    public String reverser(String str) {
        String ans = "";
        for(int i = str.length() - 1; i >= 0; i--){
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Stringable test = new Test();
        System.out.println(test.char_counter("abs cc dd  "));
        System.out.println(test.odd_positioner("abc"));
        System.out.println(test.reverser("yelyah"));
    }
}
