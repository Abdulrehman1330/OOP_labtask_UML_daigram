public class MobilePhone extends Electronics{

    String OS;

    int Storage;

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getStorage() {
        return Storage;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }

    @Override
    public String toString() {
        return
                "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax +
                ", OS='" + OS + '\'' +
                ", Storage=" + Storage +
                ", warranty='" + warranty + '\'' +
                ", powerConsumption=" + powerConsumption;
    }

    public MobilePhone(String name, int price, int quantity, String warranty, int powerConsumption, String os, int storage) {
        super(name, price, quantity, warranty, powerConsumption);
        setOS(os);
        setStorage(storage);

    }
}
