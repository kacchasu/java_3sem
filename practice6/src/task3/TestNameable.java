package task3;

public class TestNameable {
    public static void main(String[] args) {
        Nameable cutie = new Cuties("gorou");
        Nameable hottie = new Hotties("itto");
        System.out.printf("%s x %s", hottie.getName(), cutie.getName());
    }
}
