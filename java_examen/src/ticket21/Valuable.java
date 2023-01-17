package ticket21;

public interface Valuable<T extends Comparable<T>> {
    T getValue();
}
