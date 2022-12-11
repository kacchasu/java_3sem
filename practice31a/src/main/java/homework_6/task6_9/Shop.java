package homework_6.task6_9;

import java.util.ArrayList;
import java.util.Map;

public class Shop implements Printable {
    String name;
    String specialization;
    Map<String, Integer> tovary;

    public Shop(String name, String specialization, Map<String, Integer> tovary) {
        this.name = name;
        this.specialization = specialization;
        this.tovary = tovary;
    }


    @Override
    public void print() {
        System.out.println(name + ": specialization - " + specialization + "\n");
        for(String el: tovary.keySet()){
            System.out.println(el + " costs " + tovary.get(el));
        }
    }
}
