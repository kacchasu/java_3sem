package task3;

public class Person {
    private String fullName;
    private int age;

    public void move(){
        System.out.printf("%s moved", fullName);
        System.out.println();
    }

    public void talk(){
        System.out.printf("%s talks", fullName);
        System.out.println();
    }

    public Person() {
        this.fullName = "noname";
        this.age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}
