package homework_3.task4;

import java.util.ArrayList;

class Computer{
    public int ram;
    public String name;

    public Computer(int ram, String name) {
        this.ram = ram;
        this.name = name;
    }
}

public class Shop {
    public ArrayList<Computer> list = new ArrayList<Computer>();
    public void add(int ram, String name){
        list.add(new Computer(ram, name));
    }
    public Computer get(String name){
        for (Computer c: list){
            if(c.name==name){
                return c;
            }
        }
        return null;
    }
    public void remove(String name){
        for (Computer c: list){
            if(c.name==name){
                list.remove(list.indexOf(c));
            }
        }
    }
}
