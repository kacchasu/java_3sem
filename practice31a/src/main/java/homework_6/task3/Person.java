package homework_6.task3;

public class Person implements Nameable{
    int age;
    private String name;
    String profession;

    public Person(int age, String name, String profession) {
        this.age = age;
        this.name = name;
        this.profession = profession;
    }

    @Override
    public String getName() {
        return name;
    }
}
