package task10;

import java.util.Objects;

public class Memory {
    private int volume;

    public Memory(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Memory memory = (Memory) o;
        return volume == memory.volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(volume);
    }

    @Override
    public String toString() {
        return "Memory{" +
                "volume=" + volume +
                '}';
    }
}
