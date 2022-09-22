package task2;

import com.sun.xml.internal.ws.api.config.management.policy.ManagedClientAssertion;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        ArrayList<MenClothing> man_clothes = new ArrayList<>();
        ArrayList<WomenClothing> women_clothes = new ArrayList<>();

        WomenClothing skirt = new Skirt(Sizes.L, 1500, "pink");
        WomenClothing tshirt_w = new TShirt(Sizes.L, 1200, "black");
        WomenClothing pants_w = new Pants(Sizes.L, 599, "black");
        women_clothes.add(skirt);
        women_clothes.add(tshirt_w);
        women_clothes.add(pants_w);

        MenClothing tie = new Tie(Sizes.XXS, 300, "red");
        MenClothing tshirt_m = new TShirt(Sizes.XXS, 600, "black");
        MenClothing pants_m = new Pants(Sizes.XXS, 500, "black");
        man_clothes.add(tie);
        man_clothes.add(tshirt_m);
        man_clothes.add(pants_m);

        Atelier man = new Atelier();
        Atelier women = new Atelier();

        man.dressMan(man_clothes);
        women.dressWomen(women_clothes);

        man.dressMan();
        women.dressWomen();

    }
}
