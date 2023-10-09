public class Furniture extends Product{

    private String material;
    private int dimension;


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Furniture(String name, int price, int quantity,String material,int dimension) {
        super(name, price, quantity);
        setMaterial(material);
        setDimension(dimension);

    }

    @Override
    public String toString() {
        return
                "Id ='"+ id + "',Name='" + name + '\'' + ", price=" + price + ", quantity=" + quantity + ", tax=" + tax +
                "Furniture{" +
                "material='" + material + '\'' +
                        "dimension=" + dimension ;
    }
}
