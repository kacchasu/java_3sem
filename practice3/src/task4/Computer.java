package task4;

public class Computer {

    public int index;
    private String CPU;
    private String GPU;
    private String RAM;

    private String SSD;

    public Computer(int index, String CPU, String GPU, String RAM, String SSD){
        this.index = index;
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.SSD = SSD;
    }

}
