package task10;

import java.util.Objects;

public class Processor {
    private int clockspeed;

    @Override
    public String toString() {
        return "Processor{" +
                "clockspeed=" + clockspeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Processor processor = (Processor) o;
        return clockspeed == processor.clockspeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clockspeed);
    }

    public int getClockspeed() {
        return clockspeed;
    }

    public Processor(int clockspeed) {
        this.clockspeed = clockspeed;
    }
}
