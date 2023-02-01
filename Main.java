package laptop;

public class Main {

    public static void main(String[] args) {

        Asus lt2 = new Asus("HDD","DRAM","Intel");
        Lenovo lt3 = new Lenovo("SSD","DRAM","Intel");
        MSI lt4 = new MSI("SSD","SRAM","AMD");
        Laptop lt5 = new Asus("HDD","SRAM","Intel");

        lt2.printHDD();
        lt2.printRAM();
        lt2.printCPU();
        
        lt3.printHDD();
        lt3.printRAM();
        lt3.printCPU();
        
        lt4.printHDD();
        lt4.printRAM();
        lt4.printCPU();
        
        lt5.printHDD();
        lt5.printRAM();
        lt5.printCPU();
    }
}
