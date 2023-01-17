package ticket25;

public class Test {
    public static void main(String[] args) {
        var stack = new ListStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        for (int i = 0; i < 3; i++) {
            System.out.println(stack.pop());
        }
    }
}
