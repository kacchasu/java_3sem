package task2;

import java.util.ArrayList;

public class Atelier {
    private ArrayList<MenClothing> men;
    private ArrayList<WomenClothing> women;

    public void dressMan(ArrayList<MenClothing> men) {
        this.men = men;
    }

    public void dressWomen(ArrayList<WomenClothing> women) {
        this.women = women;
    }

    public void dressMan() {
        System.out.println("man clothes");
        for (MenClothing thing : men) {

            thing.dressMan();
            System.out.println();
        }
    }

    public void dressWomen() {
        System.out.println("women clothes");
        for (WomenClothing thing : women) {

            thing.dressWomen();
            System.out.println();
        }
    }
}
