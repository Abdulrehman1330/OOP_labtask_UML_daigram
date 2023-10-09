public class Table extends Furniture{

    String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Table(String name, int price, int quantity, String material, int dimension, String shape) {
        super(name, price, quantity, material, dimension);
        setShape(shape);

    }

    @Override
    public String toString() {
        return
                "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax +
                ", shape='" + shape + '\'' ;
    }
}
