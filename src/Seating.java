public class Seating extends Furniture{
    public int capacity;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Seating(String name, int price, int quantity, String material, int dimension, int capacity) {
        super(name, price, quantity, material, dimension);
        setCapacity(capacity);

    }

    @Override
    public String toString() {
        return
                "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax +
                "capacity=" + capacity ;
    }
}
