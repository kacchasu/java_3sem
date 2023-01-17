package ticket29;

public class ArrayStack<T>{
    private T[] stack;
    private int size;

    public ArrayStack() {
        stack = (T[]) new Object[10];
        size = 0;
    }

    public void push(T o) {
        if (size == stack.length) {
            T[] newArray = (T[]) new Object[stack.length * 2];
            for (int i = 0; i < stack.length; i++) {
                newArray[i] = stack[i];
            }
            stack = newArray;
        }
        for (int i = 0; i < stack.length; i++) {
            if (stack[i] == null) {
                stack[i] = o;
                break;
            }
        }
        size++;
    }

    public T pop() {
        T temp = stack[size - 1];
        stack[size - 1] = null;
        size--;
        return temp;
    }

    public T peek() {
        return stack[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
