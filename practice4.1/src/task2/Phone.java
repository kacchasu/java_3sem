package task2;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 1;
    }

    public Phone(int number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }

    public Phone() {
        this.weight = 1;
        this.model = "model";
        this.number = 11111;
    }

    public void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
        return number;
    }

    public void receiveCall(String name, int number){
        System.out.printf("Звонит %s (%d)", name, number);
        System.out.println();
    }

    public void sendMessage(int number, int...numbers){
        System.out.println(number);
        for(int x : numbers){
            System.out.println(x);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
