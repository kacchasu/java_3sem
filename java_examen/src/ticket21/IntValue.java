package ticket21;

public class IntValue implements Valuable<Integer> {
    private final int value;

    public IntValue(int value) {
        this.value = value;
    }

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
