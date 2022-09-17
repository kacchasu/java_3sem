package task3;


class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("arataki itto", 19);
        Person person2 = new Person();

        person1.move();
        person2.talk();
    }
}