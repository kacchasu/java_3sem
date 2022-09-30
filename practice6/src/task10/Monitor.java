package task10;

import java.util.Objects;

public class Monitor {
    private int size;
    private int hertz;

    public Monitor(int size, int hertz) {
        this.size = size;
        this.hertz = hertz;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return size == monitor.size && hertz == monitor.hertz;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, hertz);
    }

    public int getHertz() {
        return hertz;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "size=" + size +
                ", hertz=" + hertz +
                '}';
    }
}
