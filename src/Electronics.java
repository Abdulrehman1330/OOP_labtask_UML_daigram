public class Electronics extends Product{
    String warranty;

    int powerConsumption;

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty1) {
        warranty1 = warranty;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public Electronics(String name, int price, int quantity,String warranty,int powerConsumption) {
        super(name, price, quantity);
        setWarranty(warranty);
        setPowerConsumption(powerConsumption);

    }

    @Override
    public String toString() {
        return  "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax +
                "Electronics{" +
                "Warranty='" + warranty + '\'' +
                ", powerConsumption=" + powerConsumption ;
    }
}
