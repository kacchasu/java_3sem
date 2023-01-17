package ticket14;

import java.util.Stack;

public class Test {
    public boolean equals(Stack<Integer> a, Stack<Integer> b) {
        if (a.size() != b.size()) {
            return false;
        }
        Stack<Integer> temp = new Stack<Integer>();
        while (!a.isEmpty()) {
            int aValue = a.pop();
            int bValue = b.pop();
            if (aValue != bValue) {
                return false;
            }
            temp.push(aValue);
            temp.push(bValue);
        }
        while (!temp.isEmpty()) {
            a.push(temp.pop());
            b.push(temp.pop());
        }
        return true;
    }

    public static void main(String[] args) {
        Test test = new Test();
        Stack<Integer> a = new Stack<Integer>();
        Stack<Integer> b = new Stack<Integer>();
        a.push(1);
        a.push(2);
        a.push(3);
        b.push(1);
        b.push(2);
        b.push(3);
        System.out.println(test.equals(a, b));
    }
}
