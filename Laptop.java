package laptop;

public class Laptop {

    String hdd;
    String ram;
    String cpu;

    Laptop(String hdd, String ram, String cpu) {
        this.hdd = hdd;
        this.ram = ram;
        this.cpu = cpu;
    }

    Laptop() {
        
    }
    void printHDD() {
        System.out.println(this.getClass().getName()+" HDD: "+ this.hdd);
    }
    void printRAM() {
        System.out.println("RAM: " + this.ram);
    }
    void printCPU() {
        System.out.println("CPU: " + this.cpu);
    }

}
