public class Product {

    int id;
    static int counter = 1;
    String name;
    int price;
    int quantity;
    double tax;

    public Product(String name, int price, int quantity) {
        id = counter++;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.tax = price * 0.05;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax;
    }
}
