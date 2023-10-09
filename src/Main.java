// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Inventory inventory=new Inventory();
        Product p1= new Product("Product",450, 1 );
        Electronics e1= new Electronics("Electronics",450, 1, "12/12/2023",200 );
        Laptops l1= new Laptops("Laptop",450, 1, "12/12/2023",200,ProcessorType.Intel , 15, 17);
        MobilePhone m1= new MobilePhone("Mobile",450, 1, "12/12/2023",200, "ANDROID", 64);
        Furniture f1= new Furniture("Furniture",450, 1, "wood", 20);
        Seating s1= new Seating("Seating",450, 1, "wood", 145,5);
        Table t1= new Table("Table",450, 1, "wood", 200, "CIRCLE");
        Groceries g1= new Groceries("Groceries",450, 1, "12/12/2024", 500);

        inventory.addProduct(p1);
        inventory.addProduct(e1);
        inventory.addProduct(l1);
        inventory.addProduct(m1);
        inventory.addProduct(f1);
        inventory.addProduct(s1);
        inventory.addProduct(t1);
        inventory.removeProduct("Product");
        inventory.addProduct(g1);

        inventory.displayProducts();

    }
}