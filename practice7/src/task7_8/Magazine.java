package task7_8;

public class Magazine implements Printable {
    private int cost;
    private String magazine;

    public Magazine() {
    }

    public Magazine(int cost, String magazine) {
        this.cost = cost;
        this.magazine = magazine;
    }

    @Override
    public void print() {
        System.out.println("magazine title: " + magazine);
    }

    public static void printMagazines(Printable[] printable) {
        for (Printable magaz : printable) {
            if(magaz instanceof Magazine)
                magaz.print();
        }
    }
}
