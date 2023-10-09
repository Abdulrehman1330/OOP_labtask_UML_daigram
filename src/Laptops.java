enum ProcessorType{
    Intel,AMD
}

public class Laptops extends Electronics{
    ProcessorType processorType;
    int ramSize;
    int screenDimensions;

    @Override
    public String toString() {
        return
                "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax +
                ", ProcessorType='" + processorType + '\'' +
                ", RamSize=" + ramSize +
                ", ScreenDimensions=" + screenDimensions +
                ", Warranty='" + warranty + '\'' +
                ", PowerConsumption=" + powerConsumption ;
    }

    public ProcessorType getProcessorType() {
        return processorType;
    }

    public void setProcessorType(ProcessorType processorType) {
        this.processorType = processorType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getScreenDimensions() {
        return screenDimensions;
    }

    public void setScreenDimensions(int screenDimensions) {
        this.screenDimensions = screenDimensions;
    }

    public Laptops(String name, int price, int quantity, String warranty, int powerConsumption, ProcessorType processorType, int ramSize, int screenDimensions) {
        super(name, price, quantity, warranty, powerConsumption);
        setRamSize(ramSize);
        setScreenDimensions(screenDimensions);

    }
}
