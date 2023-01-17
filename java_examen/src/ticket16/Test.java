package ticket16;

import java.util.ArrayDeque;
import java.util.Stack;

public class Test {
    public Stack<Integer> copyStack(Stack<Integer> s) {
        ArrayDeque<Integer> temp = new ArrayDeque<Integer>();
        Stack<Integer> result = new Stack<Integer>();
        while (!s.isEmpty()) {
            temp.push(s.pop());
        }
        while (!temp.isEmpty()) {
            int value = temp.pop();
            s.push(value);
            result.push(value);
        }
        return result;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        Stack<Integer> result = test.copyStack(s);
        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
        System.out.println();
        while (!result.isEmpty()) {
            System.out.print(result.pop() + " ");
        }
    }
}
