public class Inventory {

    Product[] products;
    int CurrentProducts;

    Inventory(){
        products = new Product[100];
    }
        public void addProduct(Product p) {
            if (CurrentProducts < 100) {
                products[CurrentProducts++] = p;
            } else {
                System.out.println("Inventory is full");
            }
        }

        public void removeProduct(String p) {
            for (int i = 0; i < CurrentProducts; i++) {
                if (p.equals(products[i].name)) {
                    for (int j = i; j < CurrentProducts - 1; j++) {
                        products[j] = products[j + 1];
                    }
                    products[CurrentProducts - 1] = null;
                    CurrentProducts--;
                    break;
                }
            }
        }
        public void displayProducts() {
            if (CurrentProducts == 0) {
                System.out.println("Inventory is empty");
                return;
            } else {

                System.out.println("List of Products:");
                for (int i = 0; i < CurrentProducts; i++) {
                    System.out.println(products[i]);
                }
            }
        }
    }
