import java.io.Serializable;

public final class Drink extends MenuItem implements Alchoholable, Serializable {
    private double alcoholVol;
    private DrinkTypeEnum type;
    public Drink(String name, String description, int price, DrinkTypeEnum type, double alcoholVol) {
        super(name, description, price);
        this.type = type;
        this.alcoholVol = alcoholVol;
    }
    public DrinkTypeEnum getType() {
        return type;
    }
    public double getAlcoholVol() {
        return alcoholVol;
    }
    public boolean isAlcoholicDrink() {
        return alcoholVol > 0;
    }
}
