package ticket15;

import java.util.Arrays;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        var stack = new Stack<Integer>();
        for (int i = 5; i >= -5; i--) {
            stack.push(i);
        }
        System.out.println(Arrays.toString(stack.toArray()));
        splitStack(stack);
        System.out.println(Arrays.toString(stack.toArray()));
    }

    public static void splitStack(Stack<Integer> stack) {
        var queue = new LinkedBlockingQueue<Integer>();
        var negativeCount = 0;
        while (!stack.isEmpty()) {
            var elem = stack.pop();
            queue.add(elem);
            if (elem < 0) {
                negativeCount++;
            }
        }
        while (!queue.isEmpty()) {
            var elem = queue.remove();
            if (elem < 0) {
                stack.push(elem);
                negativeCount--;
            } else if (negativeCount > 0) {
                queue.add(elem);
            } else {
                stack.push(elem);
            }
        }
    }
}
