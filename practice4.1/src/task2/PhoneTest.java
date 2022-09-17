package task2;


class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1234, "mod", 150);
        Phone phone2 = new Phone(123456, "m");
        Phone phone3 = new Phone();

        System.out.println(phone1.toString());
        System.out.println(phone2.toString());
        System.out.println(phone3.toString());

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("phone1");
        phone2.receiveCall("phone2");
        phone3.receiveCall("phone3");

        phone3.receiveCall("phone1", phone1.getNumber());

        phone1.sendMessage(phone1.getNumber(), phone2.getNumber());
    }
}