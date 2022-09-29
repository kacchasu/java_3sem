package task4;

public class Test {
    public static void main(String[] args) {
        MathCalculable ex = new MathFunc();
        System.out.println("length of circle with radius = 3: " + 2 * ex.PI * 3);
        System.out.println("module of complex number 2 + 3i: " + ex.complex_m(2, 3));
    }
}
