package task10;

import java.util.Scanner;

public class Test {
    public static Computer enterComputer(Scanner in){
        Memory memory;
        Monitor monitor;
        Processor processor;
        Brand brand;
        int cost;
        System.out.print("enter brand (orange / orroid): ");
        switch (in.nextLine()) {
            case "orange":
                brand = Brand.orange;
                break;
            case "orroid":
                brand = Brand.orroid;
                break;
            default:
                brand = Brand.orroid;
        }

        System.out.print("enter memory volume: ");
        memory = new Memory(in.nextInt());

        System.out.print("enter monitor size and hertz: ");
        monitor = new Monitor(in.nextInt(), in.nextInt());

        System.out.println("enter processor clockspeed: ");
        processor = new Processor(in.nextInt());

        System.out.println("enter computer cost: ");
        cost = in.nextInt();

        return new Computer(memory, monitor, processor, brand, cost);
    }
    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("add computers to shop with \"new\" or enter \"stop\" to end");

        String command = in.nextLine();
        while (command.equals("new")) {
            System.out.println("- entering new computer -");
            shop.addComputer(Test.enterComputer(in));
            System.out.println("computer added");
            in.skip("\n");
            command = in.nextLine();
        }
        System.out.println("enter \"find\" or \"delete\" command to do or anything else to stop");
        command = in.nextLine();
        while (command.equals("find") || command.equals("delete")) {
            if (command.equals("find")){
                System.out.println(shop.findComputer(Test.enterComputer(in)));
            }
            else {
                shop.deleteComputer(Test.enterComputer(in));
                System.out.println("computer deleted");
            }

            in.skip("\n");
            command = in.nextLine();
        }
        System.out.println(shop.toString());
    }
}
