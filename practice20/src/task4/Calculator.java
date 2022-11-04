package task4;

public class Calculator {
    public static <N extends Number> double sum(N a, N b) {
        return a.doubleValue() + b.doubleValue();
    }
    
    public static <N extends Number> double mul(N a, N b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <N extends Number> double div(N a, N b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <N extends Number> double sub(N a, N b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(mul(2, 2));
        System.out.println(div(2, 2));
        System.out.println(sub(2, 2));
    }
}
