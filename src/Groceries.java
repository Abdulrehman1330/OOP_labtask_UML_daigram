
public class Groceries extends Product{

    private String expiryDate;
    private int Calories;

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }

    public Groceries(String name, int price, int quantity,String expiryDate,int calories) {
        super(name, price, quantity);
        setExpiryDate(expiryDate);
        setCalories(calories);
    }

    @Override
    public String toString() {
        return  "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax +
                ", ExpiryDate='" + expiryDate + '\'' +
                ", Calories=" + Calories ;
    }
}
