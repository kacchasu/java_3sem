package task10;

import java.util.Objects;

public class Computer {
    private Memory memory;
    private Monitor monitor;
    private Processor processor;
    private Brand brand;
    private int cost;

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getCost() {
        return cost;
    }

    public Computer(Memory memory, Monitor monitor, Processor processor, Brand brand, int cost) {
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
        this.brand = brand;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory=" + memory +
                ", monitor=" + monitor +
                ", processor=" + processor +
                ", brand=" + brand +
                ", cost=" + cost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return cost == computer.cost && Objects.equals(memory, computer.memory) && Objects.equals(monitor, computer.monitor) && Objects.equals(processor, computer.processor) && brand == computer.brand;
    }

}
